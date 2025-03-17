package org.example.ex07_annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Apitesing018_testng_dependOnMethod {

    @Test
    public void serverstart(){
        System.out.println("i will run  first");
        Assert.assertTrue(true);
    }
    @Test(dependsOnMethods = "serverstart")
    public void method1(){
        System.out.println("method1");
        Assert.assertTrue(true);

    }
    @Test(dependsOnMethods = "serverstart")
    public void method2(){
        System.out.println("method2");
        Assert.assertTrue(true);

    }


}
