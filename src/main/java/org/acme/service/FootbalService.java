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
            HttpResponse<JsonNode> data = FootbalAPI.Leagues();
            return data.getBody();
        } catch (Exception e) {
            return new JsonNode("{message: 'error', error: '" + e + "'}");
        }
    }
}
