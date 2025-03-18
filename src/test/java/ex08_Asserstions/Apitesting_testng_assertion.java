package ex08_Asserstions;

import org.testng.asserts.SoftAssert;

public class Apitesting_testng_assertion {
//    @Test
//    public void test_hardassertex(){
//        System.out.println("start of the program");
//        Boolean is_new=false;
//        Assert.assertEquals("promod","Promod");
//        System.out.println("endo fo the program");
//    }
//    @Test
    public void test_softassert(){
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(false);
        System.out.println("end of the progam");
    }
}
