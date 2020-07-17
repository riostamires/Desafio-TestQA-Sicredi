package test.sicredi.tests;


import org.junit.Test;
import test.sicredi.core.BaseTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APITests extends BaseTest {


    @Test
    public void deveAcessarAPIComSucesso() {
        given()
                .when()
                .get("/v1/simulador")
                .then()
                .statusCode(200)
                .body("id", is(1))
                .body("meses", contains("112", "124", "136", "148"))
                .body("valor", contains("2.802", "3.174", "3.564", "3.971"))
        ;
    }
}
