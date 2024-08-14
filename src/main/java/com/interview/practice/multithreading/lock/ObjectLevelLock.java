package com.interview.practice.multithreading.lock;

class MyThreadClass implements Runnable {
    @Override
    public void run() {
        lockObjectLevel();
    }
    public synchronized void lockObjectLevel(){
        /* object level locking is used when single object with multiple thread using same method
         *to avoid data incosistency we are using class level locking
         * if i remove static from method incosistant output return  */
        for (int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + " Hello "+i);
        }
        System.out.println("================================");
    }
}


public class ObjectLevelLock{
    public static void main(String[] args) {

        MyThreadClass thread1 = new MyThreadClass();

        Thread t1 = new Thread(thread1, "Thread 1");
        Thread t2 = new Thread(thread1, "Thread 2");

        t1.start();
        t2.start();

    }
}
