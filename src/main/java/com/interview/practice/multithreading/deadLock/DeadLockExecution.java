package com.interview.practice.multithreading.deadLock;

class MyThread1 implements Runnable{

    private final Object lock1;
    private final Object lock2;

    public MyThread1(Object lock1, Object lock2){
        super();
        this.lock1=lock1;
        this.lock2=lock2;
    }

    public void run(){

        synchronized (lock1){
            System.out.println(Thread.currentThread().getName()+ " Locked Resource 1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock2){
                System.out.println(Thread.currentThread().getName()+ " Locked Resource 2");
            }
        }
    }
}
class MyThread2 implements Runnable{
    private final Object lock1;
    private final Object lock2;

    public MyThread2(Object lock1, Object lock2){
        super();
        this.lock1=lock1;
        this.lock2=lock2;
    }

    public void run(){

        synchronized (lock2){
            System.out.println(Thread.currentThread().getName()+ " Locked Resource 2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock1){
                System.out.println(Thread.currentThread().getName()+ " Locked Resource 1");
            }
        }
    }
}
public class DeadLockExecution {

    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        MyThread1 myThread1 = new MyThread1(lock1, lock2);
        MyThread2 myThread2 = new MyThread2(lock1, lock2);

        Thread t1 = new Thread(myThread1, "T1");
        Thread t2 = new Thread(myThread2, "T2");

        t1.start();
        t2.start();
    }
}
