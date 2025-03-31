package ex08_Asserstions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;


public class Apitesting025_Restassured_assertion {
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;
    String token;
    Integer bookingId;
    @Test
    public void tesst_post(){
        String postpayload="{{\\n\" +\n" +
                "                \"    \\\"firstname\\\" : \\\"Jim\\\",\\n\" +\n" +
                "                \"    \\\"lastname\\\" : \\\"Brown\\\",\\n\" +\n" +
                "                \"    \\\"totalprice\\\" : 111,\\n\" +\n" +
                "                \"    \\\"depositpaid\\\" : true,\\n\" +\n" +
                "                \"    \\\"bookingdates\\\" : {\\n\" +\n" +
                "                \"        \\\"checkin\\\" : \\\"2018-01-01\\\",\\n\" +\n" +
                "                \"        \\\"checkout\\\" : \\\"2019-01-01\\\"\\n\" +\n" +
                "                \"    },\\n\" +\n" +
                "                \"    \\\"additionalneeds\\\" : \\\"Breakfast\\\"\\n\" +\n" +
                "                \"}}";
       requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/auth"+bookingId);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(postpayload).log().all();

        Response response=requestSpecification.when().post();
        validatableResponse=response.then().log().all();
               validatableResponse.statusCode(200);
        validatableResponse.body("booking.firstname", equalTo("Jim"));
        validatableResponse.body("booking.lastname", equalTo("Brown"));
        validatableResponse.body("booking.depositpaid", equalTo("false"));
//        validatableResponse.body("bookingid", notNullValue());

    }
}
