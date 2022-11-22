package org.acme.repository;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.acme.domain.Game;

@ApplicationScoped
public class GameRepository implements PanacheRepository<Game> {
}