package org.acme.repository;

import javax.enterprise.context.ApplicationScoped;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import org.acme.domain.Game;
import org.json.JSONObject;

import java.util.*;

@ApplicationScoped
public class FootballRepository implements TestInterface {

    public FootballRepository() {
    }

    public JsonNode allLeagues() {
        try {
            HttpResponse<JsonNode> data = ApiFootball.Leagues();
            return data.getBody();
        } catch (Exception e) {
            return new JsonNode("{message: 'error', error: '" + e + "'}");
        }
    }

    public JsonNode clubById(String id) {
        try {
            HttpResponse<JsonNode> data = ApiFootball.Clubs(id);
            return data.getBody();
        } catch (Exception e) {
            return new JsonNode("{message: 'error', error: '" + e + "'}");
        }
    }

    public JsonNode GetGamesFromClub(String id, String leagueid) {
        try {
            HttpResponse<JsonNode> data = ApiFootball.Games(id, leagueid);
            return data.getBody();
        } catch (Exception e) {
            return new JsonNode("{message: 'error', error: '" + e + "'}");
        }
    }

    public List<Game> GamesByClub(String id, String leagueid) {
        try {

            List<Game> gameList = new ArrayList<>();

            var data = new JSONObject(GetGamesFromClub(id, leagueid).toPrettyString());
            var games = data.getJSONArray("response");
            int amount = Integer.parseInt(data.get("results").toString());
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

                    gameList.add(insertGame);

                }

            }
            return gameList;
        } catch (Exception e) {
            return null;
        }
    }
}
