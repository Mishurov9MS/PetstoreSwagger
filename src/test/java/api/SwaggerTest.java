package api;

import io.restassured.http.ContentType;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class SwaggerTest {
private final static String URL ="https://petstore.swagger.io/v2";




    @Test
    public void accessToPetstoreOrdersTest(){
        int store=given()
                .when()
                .contentType(ContentType.JSON)
                .get(URL+"/store/inventory")
                .then()
                .log().body()
                .extract().body().jsonPath().getInt("sold");



    }
}
