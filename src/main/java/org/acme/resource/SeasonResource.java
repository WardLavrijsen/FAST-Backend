package org.acme.resource;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.acme.domain.Season;
import org.acme.service.SeasonService;

@Path("/api/season")
public class SeasonResource {

    @Inject
    private SeasonService seasonService;

    public SeasonResource() {
    }

    @GET
    public List<Season> allSeason() {
        return seasonService.allSeason();
    }

    @POST
    public Response addSeason(Season season) {
        Season seasonWithId = seasonService.addSeason(season);
        return Response.created(URI.create("/api/season/" + seasonWithId.getId())).build();
    }
}
