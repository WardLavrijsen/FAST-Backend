package org.acme.resource;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GameRecourceTest {
    @Test
    public void getGamesAjax() {
        given()
                .when().get("/api/game/88/194")
                .then()
                .statusCode(200)
                .body("size()", is(2));
    }

    @Test
    public void getGamesPSV() {
        given()
                .when().get("/api/game/88/197")
                .then()
                .statusCode(200)
                .body("size()", is(2));
    }

    @Test
    public void getGamesBarcelona() {
        given()
                .when().get("/api/game/140/529")
                .then()
                .statusCode(200)
                .body("size()", is(2));
    }

    @Test
    public void getGamesValencia() {
        given()
                .when().get("/api/game/140/532")
                .then()
                .statusCode(200)
                .body("size()", is(2));
    }
}
