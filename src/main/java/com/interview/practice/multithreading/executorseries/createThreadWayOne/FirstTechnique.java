package com.interview.practice.multithreading.executorseries.createThreadWayOne;

import java.sql.Time;

public class FirstTechnique {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread starts here");
        FirstTask firstTask = new FirstTask();
        firstTask.join();
        System.out.println("main thread ends here");
    }

}


class FirstTask extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Task Executed " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public FirstTask() {
        this.start();
    }
}