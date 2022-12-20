package org.acme.repository;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import org.acme.domain.Game;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class TestFootballRepository implements TestInterface {
    public TestFootballRepository() {
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
            return new JsonNode("{message: 'error occured', error: '" + e + "'}");
        }
    }

    public List<Game> GamesByClub(String id, String leagueid) {

        List<Game> gameList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Game game = new Game();
            game.setAwayid(i);
            game.setAwaylogo("testlogo");
            game.setAwayname("testname");
            game.setDate("testDate");
            game.setHomeid(Integer.parseInt(id));
            game.setHomelogo("homelogoTest");
            game.setHomename("homenameTest");
            game.setLeagueId(Integer.parseInt(leagueid));
            gameList.add(game);
        }

        return gameList;

    }
}
