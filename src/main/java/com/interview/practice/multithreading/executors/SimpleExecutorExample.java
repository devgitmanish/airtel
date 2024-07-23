package com.interview.practice.multithreading.executors;

import org.w3c.dom.css.CSSRuleList;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleExecutorExample {

    public static void main(String[] args) {

        Runnable runnable1 = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println("Thread " + Thread.currentThread().getName());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread " + Thread.currentThread().getName());
            }
        };


        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 3; i++)
            executorService.execute(runnable1);


        executorService.shutdown();
    }
}
