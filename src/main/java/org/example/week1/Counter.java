package org.example.week1;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    AtomicInteger count=new AtomicInteger(0);

    public void increment(){
        count.incrementAndGet();
    }

    public static void main(String[] args) {
        Counter counter=new Counter();
        counter.increment();
        System.out.println(counter.count.get());
    }
}
