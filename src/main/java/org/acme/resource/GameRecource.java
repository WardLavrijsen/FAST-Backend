package org.acme.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.List;

import org.acme.domain.Club;
import org.acme.domain.Game;

import org.acme.domain.ResponseClubs;

import javax.inject.Inject;

import org.jboss.resteasy.reactive.RestPath;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.acme.service.ClubService;
import org.acme.service.CompetitionService;
import org.acme.service.GameService;

@Path("/api/game/{id}")
public class GameRecource {

    @Inject
    private ClubService clubService;
    @Inject
    private CompetitionService competitionService;
    @Inject
    private GameService gameService;

    @GET
    @Path("/{clubid}")
    public List<Game> getGames(@RestPath String id, @RestPath String clubid) {
        return gameService.allGamesByClubAndLeagueId(Integer.parseInt(clubid), Integer.parseInt(id));
    }

    @POST
    public String post(@RestPath String id, @JsonProperty("clubs") ResponseClubs clubs) {
        if (competitionService.allCompetitions().stream().filter(c -> c.getId().equals(Integer.parseInt(id)))
                .count() == 0) {
            competitionService.addCompetition(clubs.getCompetition());
        }

        for (Club club : clubs.getClubs()) {
            club.setLeagueId(Integer.parseInt(id));
            if (clubService.allClubs().stream().filter(c -> c.getId().equals(club.getId())).count() == 0) {
                clubService.addClub(club);
                gameService.addGames(club.getId().toString(), id);
            }
        }
        return "Clubs added";
    }
}