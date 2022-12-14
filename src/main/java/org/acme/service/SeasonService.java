package org.acme.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import org.acme.domain.Season;
import org.acme.repository.SeasonRepository;

@ApplicationScoped
public class SeasonService {

    @Inject
    SeasonRepository seasonRepository;

    public SeasonService() {
    }

    public List<Season> allSeason() {
        return seasonRepository.listAll();
    }

    @Transactional
    public Season addSeason(Season season) {
        seasonRepository.persist(season);
        return season;
    }
}
