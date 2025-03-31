package org.example.ex07_annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiTesting021_alwaysrun {
    @Test(alwaysRun = true,enabled = false)
    public void test1(){
        Assert.assertTrue(true);
    }
    @Test
    public void test2(){
        Assert.assertTrue(true);
    }
    @Test
    public void test3(){
        Assert.assertTrue(true);
    }
}
