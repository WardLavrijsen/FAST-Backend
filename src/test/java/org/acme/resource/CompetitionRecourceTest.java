package org.acme.resource;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@TestHTTPEndpoint(CompetitionRecource.class)
public class CompetitionRecourceTest {

    @Test
    public void getAllCompetitions() {
        given()
                .when().get("/")
                .then()
                .statusCode(200)
                .body("size()", is(2));
    }

    @Test
    public void testCompetitionByLeagueIdEndpoint88() {
        given()
                .when().get("/88")
                .then()
                .statusCode(200)
                .body("size()", is(2));
    }

    @Test
    public void testCompetitionByLeagueIdEndpoint140() {
        given()
                .when().get("/140")
                .then()
                .statusCode(200)
                .body("size()", is(2));
    }

}