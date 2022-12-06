package org.acme.repository;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class ApiFootball {

        public static HttpResponse<JsonNode> Leagues() throws Exception {
                // eigen
                HttpResponse<JsonNode> response = Unirest.get("https://v3.football.api-sports.io/leagues?season=2022")
                                .header("x-rapidapi-key", "46592bcaa6678eb4c63c300054402f18")
                                .header("x-rapidapi-host", "v3.football.api-sports.io")
                                .asJson();
                return response;
        }

        public static HttpResponse<JsonNode> Clubs(String id) throws Exception {
                // eigen
                HttpResponse<JsonNode> response = Unirest
                                .get("https://v3.football.api-sports.io/teams?season=2022&league=" + id)
                                .header("x-rapidapi-key", "46592bcaa6678eb4c63c300054402f18")
                                .header("x-rapidapi-host", "v3.football.api-sports.io")
                                .asJson();
                return response;

        }

        public static HttpResponse<JsonNode> Games(String id, String leagueid) throws Exception {
                // eigen
                HttpResponse<JsonNode> response = Unirest
                                .get("https://v3.football.api-sports.io/fixtures?season=2022&team=" + id + "&league="
                                                + leagueid)
                                .header("x-rapidapi-key", "46592bcaa6678eb4c63c300054402f18")
                                .header("x-rapidapi-host", "v3.football.api-sports.io")
                                .asJson();
                return response;

        }
}