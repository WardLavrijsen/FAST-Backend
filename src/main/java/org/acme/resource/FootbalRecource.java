package org.acme.resource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.acme.repository.FootballRepository;

@Path("/api/leagues")
public class FootbalRecource {

    @Inject
    private FootballRepository footbalService;

    public FootbalRecource() {
    }

    @GET
    public String allSeason() {
        var data = footbalService.allLeagues().getObject().toString();
        return data;
    }
}
