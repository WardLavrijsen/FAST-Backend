package org.acme.repository;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.acme.domain.Competition;

@ApplicationScoped
public class CompetitionRepository implements PanacheRepository<Competition> {

}