package org.acme.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import org.acme.domain.Game;
import org.json.*;

import org.acme.service.FootbalService;
import org.acme.service.GameService;

import org.acme.repository.GameRepository;

@ApplicationScoped
public class GameService {

    @Inject
    GameRepository gameRepository;

    @Inject
    private FootbalService footbalService;

    public GameService() {
    }

    public List<Game> allGames() {
        return gameRepository.listAll();
    }

    public List<Game> allGamesByClubAndLeagueId(int clubId, int leagueId) {
        return gameRepository.list("leagueId", leagueId).stream().filter(g -> g.getHomeid().equals(clubId)).toList();

    }

    public List<Game> allGamesByLeagueId(int id) {
        return gameRepository.list("leagueId", id);
    }

    @Transactional
    public void addGames(String id, String leagueid) {
        var data = new JSONObject(footbalService.gamesByClub(id, leagueid).toPrettyString());
        var games = data.getJSONArray("response");
        Integer amount = Integer.parseInt(data.get("results").toString());
        for (int i = 0; i < amount; i++) {
            var game = games.getJSONObject(i);
            String homeTeam = game.getJSONObject("teams").getJSONObject("home").get("id").toString();
            if (Integer.parseInt(homeTeam) == Integer.parseInt(id)) {
                Game insertGame = new Game();

                insertGame.setHomeid(
                        Integer.parseInt(game.getJSONObject("teams").getJSONObject("home").get("id").toString()));
                insertGame.setHomename(game.getJSONObject("teams").getJSONObject("home").get("name").toString());
                insertGame.setHomelogo(game.getJSONObject("teams").getJSONObject("home").get("logo").toString());

                insertGame.setAwayid(
                        Integer.parseInt(game.getJSONObject("teams").getJSONObject("away").get("id").toString()));
                insertGame.setAwayname(game.getJSONObject("teams").getJSONObject("away").get("name").toString());
                insertGame.setAwaylogo(game.getJSONObject("teams").getJSONObject("away").get("logo").toString());

                insertGame.setDate(game.getJSONObject("fixture").get("date").toString());
                insertGame.setLeagueId(Integer.parseInt(leagueid));

                gameRepository.persist(insertGame);

            }

        }
    }
}
