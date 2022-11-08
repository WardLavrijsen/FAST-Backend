package org.acme.repository;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.acme.domain.Club;

@ApplicationScoped
public class ClubRepository implements PanacheRepository<Club> {

}