package org.acme.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import org.acme.domain.Club;
import org.acme.repository.ClubRepository;

@ApplicationScoped
public class ClubService {

    @Inject
    ClubRepository clubRepository;

    public ClubService() {
    }

    public List<Club> allClubs() {
        return clubRepository.listAll();
    }

    public List<Club> allClubsByLeagueId(int id) {
        return clubRepository.list("leagueId", id);
    }

    @Transactional
    public Club addClub(Club club) {
        clubRepository.persist(club);
        return club;
    }
}
