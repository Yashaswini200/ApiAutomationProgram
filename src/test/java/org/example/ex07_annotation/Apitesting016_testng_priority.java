//package org.example.ex07_annotation;
//
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class Apitesting016_testng_priority {
//    @BeforeTest(priority=1)
//    public  void getoken(){
//        System.out.println("one");
//    }
//    @BeforeTest(priority=3)
//    public  void getBookingId(){
//        System.out.println("two");
//    }
//    @Test(priority=4)
//    public void testcase1(){
//        System.out.println("threee");
//    }
//    @AfterClass(priority=2)
//    public void closetest(){
//        System.out.println("close");
//    }
//}
