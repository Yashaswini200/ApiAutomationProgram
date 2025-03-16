package org.example.ex07_annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Apitesing017_Testng_group {
    @Test(groups={"sanity","reg"})
    public void test_sanityRun(){
        System.out.println("snaity");
        Assert.assertTrue(true);
    }
    @Test(groups={"p1","reg"})
    public void test_reg(){
        System.out.println("reg");
        Assert.assertTrue(false);
    }
    @Test(groups={"p1","reg"})
    public void test_smokeRun(){
        System.out.println("smoke");
        Assert.assertTrue(false);
    }
}
