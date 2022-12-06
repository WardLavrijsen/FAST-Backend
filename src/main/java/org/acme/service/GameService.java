package org.acme.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import org.acme.domain.Game;
import org.acme.repository.TestFootballRepository;
import org.acme.repository.TestInterface;
import org.json.*;
import org.acme.service.GameService;
import org.acme.repository.FootballRepository;
import org.acme.repository.GameRepository;

@ApplicationScoped
public class GameService {

    private GameRepository gameRepository;

    private TestInterface footbalService;

    public GameService() {
        footbalService = new FootballRepository();
        gameRepository = new GameRepository();
    }

    public GameService(TestInterface in) {
        footbalService = in;
        gameRepository = new GameRepository();
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

        List<Game> games = footbalService.GamesByClub(id, leagueid);
        for (Game game : games) {
            gameRepository.persist(game);
        }
    }
}
