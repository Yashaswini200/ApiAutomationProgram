package org.example.ex03_get_request;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class ApiTesting006_BDDstyle {
    @Test
    public void test_Bdd_get(){
        String pincode = "560064";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }

}
