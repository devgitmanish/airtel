package com.interview.practice.multithreading.waitnotify;

public class PrintOddEvenViaThread implements Runnable {

    static int counter = 1;
    final Object object;

    public PrintOddEvenViaThread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {

        while (counter <= 10) {

            if (counter % 2 == 0 && Thread.currentThread().getName().equalsIgnoreCase("even")) {

                synchronized (object) {
                    System.out.println("Thread Name " + Thread.currentThread().getName() + "Value :" + counter);
                    counter++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            if (counter % 2 != 0 && Thread.currentThread().getName().equalsIgnoreCase("odd")) {
                synchronized (object) {
                    System.out.println("Thread Name " + Thread.currentThread().getName() + "Value :" + counter);
                    counter++;
                    object.notify();
                }

            }
        }
    }

    public static void main(String[] args) {
        Object lock = new Object();
        Runnable r1 = new PrintOddEvenViaThread(lock);
        Runnable r2 = new PrintOddEvenViaThread(lock);

        Thread t1 = new Thread(r1, "even");
        t1.start();

        Thread t2 = new Thread(r2, "odd");
        t2.start();
    }

}
