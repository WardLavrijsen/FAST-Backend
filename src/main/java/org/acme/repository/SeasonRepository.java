package org.acme.repository;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.acme.domain.Season;

@ApplicationScoped
public class SeasonRepository implements PanacheRepository<Season> {
    
}
