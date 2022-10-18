package org.acme.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import org.acme.domain.Season;
import org.acme.repository.UserRepository;

@ApplicationScoped
public class UserService {

    @Inject
    UserRepository userRepository;

    public UserService() {
    }

}
