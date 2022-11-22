package org.acme.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import org.acme.domain.Competition;
import org.acme.repository.CompetitionRepository;

@ApplicationScoped
public class CompetitionService {

    @Inject
    CompetitionRepository competitionRepository;

    public CompetitionService() {
    }

    public List<Competition> allCompetitions() {
        return competitionRepository.listAll();
    }

    @Transactional
    public Competition addCompetition(Competition competition) {
        competitionRepository.persist(competition);
        return competition;
    }
}
