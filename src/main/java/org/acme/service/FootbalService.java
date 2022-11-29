package org.acme.service;

import javax.enterprise.context.ApplicationScoped;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;

@ApplicationScoped
public class FootbalService {

    public FootbalService() {
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

    public JsonNode gamesByClub(String id, String leagueid) {
        try {
            HttpResponse<JsonNode> data = ApiFootball.Games(id, leagueid);
            return data.getBody();
        } catch (Exception e) {
            return new JsonNode("{message: 'error', error: '" + e + "'}");
        }
    }
}
