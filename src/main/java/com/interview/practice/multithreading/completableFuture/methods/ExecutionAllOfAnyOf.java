package com.interview.practice.multithreading.completableFuture.methods;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class ExecutionAllOfAnyOf {

    public static void delay(int time) {
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static CompletableFuture<String> future1(){

        return CompletableFuture.supplyAsync(() ->{

            System.out.println("future 1 "+Thread.currentThread().getName());
            delay(2);
            return "future 1";
        });
    }

    public static CompletableFuture<String> future2(){

        return CompletableFuture.supplyAsync(() ->{
            System.out.println("future 2 "+Thread.currentThread().getName());
            delay(3);
            return "future 2";
        });
    }

    public static CompletableFuture<String> future3(){

        return CompletableFuture.supplyAsync(() ->{
            System.out.println("future 3 "+Thread.currentThread().getName());
            delay(4);
            return "future 3";
        });
    }


    public static void main(String[] args) {

        System.out.println("=====   Demo AllOf  ============================");
        long startTime = System.currentTimeMillis();
        CompletableFuture<Void> completableFuture
                = CompletableFuture.allOf(future1(), future2(), future3());
        completableFuture.join();

        long endTime = System.currentTimeMillis();

        System.out.println("Time Taken " + (endTime-startTime)/1000);

        System.out.println("=====   Demo AnyOf  ============================");

        long startTime1 = System.currentTimeMillis();
        CompletableFuture<Object> completableFuture1
                = CompletableFuture.anyOf(future1(), future2(), future3());
        completableFuture1.join();

        long endTime1 = System.currentTimeMillis();

        System.out.println("Time Taken " + (endTime1-startTime1)/1000);

    }
}
