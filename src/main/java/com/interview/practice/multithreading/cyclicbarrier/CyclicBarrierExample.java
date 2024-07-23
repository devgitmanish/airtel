package com.interview.practice.multithreading.cyclicbarrier;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class FinalAPICall implements Runnable {

    CyclicBarrier cyclicBarrier;

    public FinalAPICall(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }
    @Override
    public void run() {

        System.out.println("All Minor API Call Done by " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            /* All threads wait in this line then execute final statement*/
            cyclicBarrier.await();
            System.out.println("Thread release after await "+ Thread.currentThread().getName());
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }

    }
}
public class CyclicBarrierExample {

    public static void main(String[] args) {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
        Thread t1 = new Thread(new FinalAPICall(cyclicBarrier), "API thread 1");
        Thread t2 = new Thread(new FinalAPICall(cyclicBarrier), "API thread 2");
        Thread t3 = new Thread(new FinalAPICall(cyclicBarrier), "API thread 3");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("main thread");
    }
}
