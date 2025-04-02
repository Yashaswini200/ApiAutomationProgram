package org.example.ex07_annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Apitesing022_invocationCount {
    @Test(invocationCount = 5)
    public void test01(){
        Assert.assertTrue(true);
    }
}
