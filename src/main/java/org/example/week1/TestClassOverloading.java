package org.example.week1;


class OverloadingTest {
    void m1(int x) {
        System.out.println("m1 int");
    }

    void m1(double x) {
        System.out.println("m1 float");
    }

    void  m1(String x){
        System.out.println("m1 string");
    }
}

public class TestClassOverloading {
    public static void main(String[] args) {
        OverloadingTest overloadingTest=new OverloadingTest();
        overloadingTest.m1(1.0);
        overloadingTest.m1(1.0f);
    }
}
