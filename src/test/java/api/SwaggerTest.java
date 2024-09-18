package api;

import io.restassured.http.ContentType;
import org.junit.Test;



import static io.restassured.RestAssured.given;

public class SwaggerTest {
private final static String URL ="https://petstore.swagger.io/v2";




    //Должен вернуть тело(ключь - значение) и статус код 200
@Test
    public void accessToPetstoreOrdersTest(){
    Specifications.installSpecifications(Specifications.requestSpecification(URL),Specifications.responseSpecification200());
        int store= given()
                .when()
                .get("/store/inventory")
                .then()
                .log().all()
                .extract().body().jsonPath().getInt("sold");





    }
}
