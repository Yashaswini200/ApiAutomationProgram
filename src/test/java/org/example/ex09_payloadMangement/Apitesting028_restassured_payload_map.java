package org.example.ex09_payloadMangement;

import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class Apitesting028_restassured_payload_map {
    @Test
    public void test01(){
//        String postpayload="{{\\n\" +\n" +
//                "                \"    \\\"firstname\\\" : \\\"Jim\\\",\\n\" +\n" +
//                "                \"    \\\"lastname\\\" : \\\"Brown\\\",\\n\" +\n" +
//                "                \"    \\\"totalprice\\\" : 111,\\n\" +\n" +
//                "                \"    \\\"depositpaid\\\" : true,\\n\" +\n" +
//                "                \"    \\\"bookingdates\\\" : {\\n\" +\n" +
//                "                \"        \\\"checkin\\\" : \\\"2018-01-01\\\",\\n\" +\n" +
//                "                \"        \\\"checkout\\\" : \\\"2019-01-01\\\"\\n\" +\n" +
//                "                \"    },\\n\" +\n" +
//                "                \"    \\\"additionalneeds\\\" : \\\"Breakfast\\\"\\n\" +\n" +
//                "                \"}}";}

        Map<String,Object> jsonBobyusingMap=new LinkedHashMap<>();
        jsonBobyusingMap.put("firstname","Jim");
        jsonBobyusingMap.put("lastname","Brown");
        jsonBobyusingMap.put("depositpaid",false);
        jsonBobyusingMap.put("totalprice",123);

        Map<String,Object> bookdatemaps=new LinkedHashMap<>();
        bookdatemaps.put("checkin","2018-01-01");
        bookdatemaps.put("checkout","2019-01-01");
        bookdatemaps.put("additionalneeds","breakfast");
        System.out.println(jsonBobyusingMap);


    }
}
