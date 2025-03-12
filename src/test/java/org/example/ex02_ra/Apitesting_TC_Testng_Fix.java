package org.example.ex02_ra;

import io.restassured.RestAssured;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class Apitesting_TC_Testng_Fix {
    @Test
    @Description("tc1- verify that valid pincode give 200 ok")
    public void test_get_positive_Tc1(){
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+"110048")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
    @Test
    @Description("tc2- verify that valid pincode give 200 ok")
    public void test_get_positive_Tc2(){
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+"-1")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
    @Test
    @Description("tc2- verify that valid pincode give 200 ok")
    public void test_get_positive_Tc3(){
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+"$")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
}
