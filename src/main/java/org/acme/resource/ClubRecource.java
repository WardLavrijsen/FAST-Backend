package org.acme.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.inject.Inject;

import org.jboss.resteasy.reactive.RestPath;

import org.acme.service.FootbalService;

import javax.annotation.security.RolesAllowed;

@Path("/api/clubs/{id}")
public class ClubRecource {

    @Inject
    private FootbalService footbalService;

    @GET
    public String allParams(@RestPath String id) {
        var data = footbalService.clubById(id).getObject().toString();
        return data;
    }
}