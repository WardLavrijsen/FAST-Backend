package org.acme.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.inject.Inject;

import org.jboss.resteasy.reactive.RestPath;

import org.acme.service.FootbalService;

@Path("/api/game/{id}")
public class GameRecource {

    @Inject
    private FootbalService footbalService;

    @GET
    public String allParams(@RestPath String id) {
        var data = footbalService.gamesByClub(id).getObject().toString();
        return data;
    }
}