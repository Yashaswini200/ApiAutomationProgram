package org.example.ex04_post_request;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class Apitesting009_post_nonBddstyle {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    @Description("verify thepost req")
    @Test
    public void test_post_noBddstyle_create_token(){

         String payload="{\n"+
                 "\"username\":\"admin\",\n"+
                 "\"password\" : \"password123\"\n"+"}";

         r= RestAssured.given();
         r.baseUri("https://restful-booker.herokuapp.com");
         r.basePath("/auth");
         r.contentType(ContentType.JSON);
         r.body(payload);

         response=r.when().log().all().post();
         vr=response.then().log().all();
         vr.statusCode(200);

    }
}
