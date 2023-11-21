package org.example;


class OverloadingTest {
    void m1(int x) {
        System.out.println("m1 int");
    }

    void m1(float x) {
        System.out.println("m1 float");
    }

    void  m1(String x){
        System.out.println("m1 string");
    }
}

public class TestClassOverloading {
    public static void main(String[] args) {
        OverloadingTest overloadingTest=new OverloadingTest();
        //overloadingTest.m1(0.1);
        overloadingTest.m1(0.1f);
    }
}
