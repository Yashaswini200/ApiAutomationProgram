package org.example.ex09_payloadMangement.gson;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Apitesting030_restassured_gson {
    //gson- is google lib- which will convert your class to json
RequestSpecification requestSpecification;
ValidatableResponse validatableResponse;
@Test
    public void test_creat_booking_postive(){
    Booking booking=new Booking();
    booking.setFirstname("Jime");
    booking.setLastname("brown");
    booking.setTotalprice(112);
    booking.setDepositpaid(true);

    BookingDates bookingDates=new BookingDates();
    bookingDates.setCheckin("2024-01-01");
    bookingDates.setCheckout("2024-02-01");
//    bookingDates.setBookingDates(bookingdates);
    bookingDates.setAdditionalProperty("breakfast","hello");
    System.out.println(booking);
    Gson gson=new Gson();
    String jsonstring=gson.toJson(booking);
    System.out.println(jsonstring);

    requestSpecification = RestAssured.given();
    requestSpecification.baseUri("https://restful-booker.herokuapp.com");
//    requestSpecification.basePath("/auth"+bookingId);
    requestSpecification.contentType(ContentType.JSON);
    requestSpecification.body(jsonstring).log().all();

    Response response=requestSpecification.when().post();
    validatableResponse=response.then().log().all();
    validatableResponse.statusCode(200);

    String firstname=response.then().extract().path("booking.firstname");
    Assert.assertEquals(firstname,"Jim");

    //case2 jsonpath
    JsonPath jsonPath=new JsonPath(response.asString());
    String bookingId=jsonPath.getString("bookingid");
    String firstname1=jsonPath.getString("booking.firstname");
    String checkin=jsonPath.getString("booking.bookingDates.checkin");
    System.out.println(bookingId);
    System.out.println(firstname1);
    System.out.println(checkin);


}
}
