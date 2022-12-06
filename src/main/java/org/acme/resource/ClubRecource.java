package org.acme.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.inject.Inject;

import org.acme.repository.FootballRepository;
import org.jboss.resteasy.reactive.RestPath;

@Path("/api/clubs/{id}")
public class ClubRecource {

    @Inject
    private FootballRepository footbalService;

    @GET
    public String allParams(@RestPath String id) {
        var data = footbalService.clubById(id).getObject().toString();
        return data;
    }
}