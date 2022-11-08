package org.acme.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.acme.domain.Competition;
import org.acme.service.ClubService;
import org.acme.service.CompetitionService;
import org.jboss.resteasy.reactive.RestPath;

import org.acme.domain.Club;

@Path("/api/competitions")
public class CompetitionRecource {

    @Inject
    private CompetitionService seasonService;
    @Inject
    private ClubService clubService;

    public CompetitionRecource() {
    }

    @GET
    public List<Competition> allCompetitions() {
        return seasonService.allCompetitions();
    }

    @Path("/{id}")
    @GET
    public List<Club> competitionById(@RestPath String id) {
        return clubService.allClubsByLeagueId(Integer.parseInt(id));
    }
}
