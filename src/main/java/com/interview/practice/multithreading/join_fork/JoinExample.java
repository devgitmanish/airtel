package com.interview.practice.multithreading.join_fork;

import java.util.concurrent.atomic.AtomicInteger;

class MutiThreading implements Runnable {

    //AtomicInteger count = new AtomicInteger();
    //int count = 0;
    volatile int count = 0;
    @Override
    public void run() {
        for(int i=0; i<10000; i++){
            //count.incrementAndGet();
            count++;
        }
    }
}

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {

        MutiThreading mutiThreading = new MutiThreading();
        Thread t1 = new Thread(mutiThreading);
        Thread t2 = new Thread(mutiThreading);
        t1.start();
        t2.start();
        /*
           call join method in any thread means stop other thread until t1 is not completed.
         */
        t1.join();
        t2.join();

        System.out.println("Count Value "+mutiThreading.count);

    }
}
