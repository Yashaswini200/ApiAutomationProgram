package org.example.ex07_annotation;

import org.testng.annotations.*;

public class Apitesting023_all_annotation {
    @BeforeSuite
    void demo1(){
        System.out.println("beforesuite");
    }
    @BeforeTest
    void demo2(){
        System.out.println("before test");
    }
    @BeforeClass
    void demo3(){
        System.out.println("before class");
    }
    @BeforeMethod
    void demo4(){
        System.out.println("before method");
    }
    @Test
    void test01(){
        System.out.println("test");
    }
    @AfterMethod
    void demo6(){
        System.out.println("after method");
    }
    @AfterClass
    void demo7(){
        System.out.println("after class");
    }
    @AfterTest
    void demo8(){
        System.out.println("after test");
    }
    @AfterSuite
    void demo9(){
        System.out.println("after suite");
    }
}
