package com.interview.practice.multithreading.lock;

class MyCustomThreadClass implements Runnable {
    @Override
    public void run() {
        classLevelLock();
    }
    public static synchronized void classLevelLock(){
        /* Class level locking is used when multiple object with multiple thread using same method
        *to avoid data incosistency we are using class level locking
        * if i remove static from method incosistant output return  */
        for (int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + " Hello "+i);
        }
        System.out.println("================================");
    }
}
public class ClassLevelLock {

    public static void main(String[] args) {
        MyCustomThreadClass thread1 = new MyCustomThreadClass();
        MyCustomThreadClass thread2 = new MyCustomThreadClass();

        Thread t1 = new Thread(thread1, "Thread 1");
        Thread t2 = new Thread(thread2, "Thread 2");

        t1.start();
        t2.start();
    }

}
