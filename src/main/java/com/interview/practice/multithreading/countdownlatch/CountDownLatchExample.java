package com.interview.practice.multithreading.countdownlatch;

import org.springframework.aop.ThrowsAdvice;

import java.util.concurrent.CountDownLatch;

/*
Whenever a thread is wait to completing the other thread is completing their process countdownlatch
 */
class MyThreadCountDownLatch implements Runnable {

    private final CountDownLatch latch;

    public MyThreadCountDownLatch(CountDownLatch latch){
        this.latch=latch;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " dressed");
        System.out.println(Thread.currentThread().getName() + " packed bag");
        System.out.println(Thread.currentThread().getName() + " ready for school");
        latch.countDown();
    }

}
public class CountDownLatchExample {

    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().setName("Mother");

        CountDownLatch latch = new CountDownLatch(3);

        Thread t1 = new Thread(new MyThreadCountDownLatch(latch), "Child 1");
        Thread t2 = new Thread(new MyThreadCountDownLatch(latch), "Child 2");
        Thread t3 = new Thread(new MyThreadCountDownLatch(latch), "Child 3");
        t1.start();
        t2.start();
        t3.start();
        latch.await();
        System.out.println(Thread.currentThread().getName() + " Thread Start other work....");

    }
}