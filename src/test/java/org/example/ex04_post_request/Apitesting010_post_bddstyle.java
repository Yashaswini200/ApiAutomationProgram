package org.example.ex04_post_request;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class Apitesting010_post_bddstyle {
    @Description("verify thepost req")
    @Test
    public void test_post_noBddstyle_create_token(){

        String payload="{\n"+
                "\"username\":\"admin\",\n"+
                "\"password\" : \"password123\"\n"+"}";

        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
        .basePath("/auth")
        .contentType(ContentType.JSON)
        .body(payload)

     .when().log().all().post()
                .then().log().all()
        .statusCode(200);

    }
}
