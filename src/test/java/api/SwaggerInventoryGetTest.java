package api;

import org.junit.Test;
import static io.restassured.RestAssured.given;

public class SwaggerInventoryGetTest {
    private final static String URL = "https://petstore.swagger.io/v2";



    @Test
    public void accessToPetstoreInventoryTest() {
        Specifications.installSpecifications(Specifications.requestSpecification(URL), Specifications.responseSpecification200());
        int store = given()
                .when()
                .get("/store/inventory")
                .then()
                .log().all()
                .extract().body().jsonPath().getInt("sold");


    }


}
