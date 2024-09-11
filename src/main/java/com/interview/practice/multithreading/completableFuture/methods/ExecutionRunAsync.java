package com.interview.practice.multithreading.completableFuture.methods;

import java.util.concurrent.CompletableFuture;

public class ExecutionRunAsync {

    public static void main(String[] args) {

        CompletableFuture<Void> completableFuture
                = CompletableFuture.runAsync(ExecutionRunAsync::logicPerformed);

        completableFuture.join();

        System.out.println("programme end Thread "+Thread.currentThread().getName());

    }
    public static void logicPerformed(){
        //perform busniess logic and return something
        System.out.println("perform busniess logic");
    }
}
