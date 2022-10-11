package org.acme.repository;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.acme.domain.User;

@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {
    
}
