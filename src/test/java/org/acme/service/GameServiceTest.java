package org.acme.service;

import io.quarkus.test.junit.QuarkusTest;
import org.acme.domain.Game;
import org.acme.repository.TestFootballRepository;
import org.acme.repository.TestInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.transaction.Transactional;
import java.util.List;

@QuarkusTest
@Transactional
class GameServiceTest {

    private TestInterface footbalRepository;

    private GameService gameService;


    @BeforeEach
    void setUp() {
        footbalRepository = new TestFootballRepository();
        gameService = new GameService(footbalRepository);
    }

    @Test
    void addGames() {
        List<Game> beforeGames = gameService.allGames();
        gameService.addGames("1", "3");
        List<Game> afterGames = gameService.allGames();

        System.out.println(beforeGames.stream().count());
        System.out.println(afterGames.stream().count());
    }
}