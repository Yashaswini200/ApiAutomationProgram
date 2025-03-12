package org.example.ex01_ra_basics;
//non chaining pattern
public class ApiTesting002 {
    public void step1(){
        System.out.println("step1");
    }
    public void step2(){
        System.out.println("step2");
    } public void step3(String name){
        System.out.println("step3");
    }

    public static void main(String[] args) {
        ApiTesting002 np=new ApiTesting002();
        np.step1();
        np.step2();
        np.step3("yashu");
    }
}
