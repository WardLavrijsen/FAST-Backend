package org.acme.repository;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import org.acme.domain.Game;

import java.util.ArrayList;
import java.util.List;

public interface TestInterface {

    public JsonNode allLeagues();

    public JsonNode clubById(String id);

    public JsonNode GetGamesFromClub(String id, String leagueid);

    public List<Game> GamesByClub(String id, String leagueid);
}
