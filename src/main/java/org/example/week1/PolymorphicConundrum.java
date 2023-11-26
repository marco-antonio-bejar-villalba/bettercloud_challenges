package org.example.week1;


import java.util.function.Predicate;

class A {

}

class B extends A {

}

class C extends B {

}

public class PolymorphicConundrum {

    public static void main(String[] args) {
        A o1 = new B();
        A o2 = new C();
        System.out.printf("Test successful?===> %s %n", testCondition(PolymorphicConundrum::testA, o1, o2));
        System.out.printf("Test successful?===> %s %n", testCondition(PolymorphicConundrum::testB, o1, o2));
        System.out.printf("Test successful?===> %s %n", testCondition(PolymorphicConundrum::testC, o1, o2));
        System.out.printf("Test successful?===> %s %n", testCondition(PolymorphicConundrum::testD, o1, o2));
        System.out.printf("Test successful?===> %s %n", testCondition(PolymorphicConundrum::testE, o1, o2));

    }

    private static boolean testCondition(Predicate<A> test, A o1, A o2) {
        return test.test(o1) && !test.test(o2);
    }

    private static boolean testA(A o) {
        return (o instanceof B) && (!(o instanceof A));
    }

    private static boolean testB(A o) {
        return !((o instanceof A) || (o instanceof B));
    }

    private static boolean testC(A o) {
        return (o instanceof B) && (!(o instanceof C));
    }

    private static boolean testD(A o) {
        return !(!(o instanceof B) || (o instanceof C));
    }

    private static boolean testE(A o) {
        return (o instanceof B) && !((o instanceof A) || (o instanceof C));
    }

}
