package org.acme.resource;

import java.lang.reflect.Array;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.acme.service.FootbalService;

@Path("/api/leagues")
public class FootbalRecource {

    @Inject
    private FootbalService footbalService;

    public FootbalRecource() {
    }

    @GET
    public String allSeason() {
        var data = footbalService.allLeagues().getObject().toString();
        return data;
    }
}
