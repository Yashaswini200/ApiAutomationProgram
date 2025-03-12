package org.example.ex01_ra_basics;

public class ApiTesing004_builderpattern {
    public ApiTesing004_builderpattern step1(){
        System.out.println("step1");
        return this;
    }
    public ApiTesing004_builderpattern step2(){
        System.out.println("step2");
        return this;
    }
    public ApiTesing004_builderpattern step3(String name){
        System.out.println("step3");
        return this;
    }

    public static void main(String[] args) {
        ApiTesing004_builderpattern bp=new ApiTesing004_builderpattern();
        bp.step1().step2().step3("yashu");
    }
}
