package org.example.ex07_annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Apitesing015_beforetest {
    @BeforeTest
    public  void getoken(){
        System.out.println("one");
    }
    @BeforeTest
    public  void getBookingId(){
        System.out.println("two");
    }
    @Test
    public void testcase1(){
        System.out.println("threee");
    }
    @AfterClass
    public void closetest(){
        System.out.println("close");
    }
}
