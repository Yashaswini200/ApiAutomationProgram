package org.example.ex03_get_request;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;


public class ApiTesting008_Get_NonBDDstyle {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_nonBdd_get() {
        String pincode = "560064";
        r=RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);

        response = r.when().log().all().get();

        vr = response.then().log().all().statusCode(200);

    }
    public void test_nonBdd_get1(){
        String pincode = "-2";
        r=RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);

        response = r.when().log().all().get();

        vr = response.then().log().all().statusCode(200);

    }
}
