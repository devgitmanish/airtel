package com.interview.practice.multithreading.volatile_atomic;

public class VolatileKeyword implements Runnable {

    //public static boolean status=false;
    public static volatile boolean status=false;

    @Override
    public void run() {

        int i = 0;
        while (!status) {
            i++;
        }
        System.out.println("backend thread completed");
    }
    public static void main(String[] args) throws InterruptedException {
        VolatileKeyword v = new VolatileKeyword();
        Thread t1 = new Thread(v);
        t1.start();
        Thread.sleep(1000);
        status = true;
        System.out.println("main completed");
    }
}
