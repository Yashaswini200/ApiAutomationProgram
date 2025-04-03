package org.example.ex07_annotation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Apitesting019_Testng_parameter {
    @Parameters("browser")
    @Test
    public void demo1(String value){
        System.out.println("demo1");
        if(value.equalsIgnoreCase("chrome")){
            System.out.println(" start the chrome");
        }
        if(value.equalsIgnoreCase("firefox")){
            System.out.println(" start the firefox");
        }
    }
}
