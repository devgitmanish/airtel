package com.interview.practice.multithreading.volatile_atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class SynchronizedAtomic implements Runnable {

    /*
    1. To avoid the race condition user synchronized block;
    2. Volatile Keyword (read write)
            Visibility Guaranteed
            A write to volatile filed happens before
                    every subsequent read of the same field. (happens berfore gurantee)

    3. AtomicInteger, AtomicLong, AtomicBoolean, AtomicReference
        atomic performs when read modify and write operation performs



     */
    /*public int count = 0;
    //Race condition
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(i * 100);
                count++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }*/

    /* Rule one make it synchronized */
    /*@Override
    public synchronized void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(i * 100);
                count++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }*/

    /*Atomic perform for 3 Operation
    Read
    increment(modify)
    write
    */
    public AtomicInteger count = new AtomicInteger();
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(i * 100);
                count.incrementAndGet();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public int getCount() {
        return count.get();
    }
    public static void main(String[] args) throws InterruptedException {

        SynchronizedAtomic v1 = new SynchronizedAtomic();
        Thread t1 = new Thread(v1);
        t1.start();
        Thread t2 = new Thread(v1);
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Count "+v1.getCount());
    }
}
