package org.example.ex06_delete_request;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class Apitesting013_delete_nonBddstyle {
    @Description("verify thepost req")
    @Test
    public void test_post_noBddstyle_create_token(){
        String token="2ce65d5d37b1f";
        String bookingid="12548";


        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/auth"+bookingid);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token",token);

        Response response=requestSpecification.when().delete();
        ValidatableResponse validatableResponse=response.then().log().all();
        validatableResponse.statusCode(200);

    }
}
