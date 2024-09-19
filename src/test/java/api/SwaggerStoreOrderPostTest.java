package api;

import org.junit.Assert;
import org.junit.Test;
import static io.restassured.RestAssured.given;


public class SwaggerStoreOrderPostTest {
    private final static String URL = "https://petstore.swagger.io/v2/";


    @Test
    public void accessToPetstoreOrderTest() {
        Specifications.installSpecifications(Specifications.requestSpecification(URL), Specifications.responseSpecification200());
        Integer id = 1;
        Integer petId = 1;
        Integer quantity = 1;
        String shipDate = "2024-09-19T04:25:49.953+0000";
        String status = "placed";
        Boolean complete = true;

        StoreOrder order = new StoreOrder(1, 1, 1, "2024-09-19T04:25:49.953+0000", "placed", true);
        SuccessResponseOrder successResponseOrder = given()
                .body(order)
                .when()
                .post("store/order")
                .then()
                .log().all()
                .extract().as(SuccessResponseOrder.class);

        Assert.assertEquals(id,successResponseOrder.getId());
        Assert.assertEquals(petId,successResponseOrder.getPetId());
        Assert.assertEquals(quantity,successResponseOrder.getQuantity());
        Assert.assertEquals(shipDate,successResponseOrder.getShipDate());
        Assert.assertEquals(status,successResponseOrder.getStatus());
        Assert.assertEquals(complete,successResponseOrder.getComplete());




    }
}
