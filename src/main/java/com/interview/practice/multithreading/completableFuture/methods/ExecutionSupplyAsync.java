package com.interview.practice.multithreading.completableFuture.methods;

import java.util.concurrent.CompletableFuture;

public class ExecutionSupplyAsync {

    public static void main(String[] args) {

        CompletableFuture<String> completableFuture =
                CompletableFuture.supplyAsync(ExecutionSupplyAsync::valueReturn);

        System.out.println(completableFuture.join());
    }

    public static String valueReturn(){
        //some business logic which return something
        return "someValue";
    }
}
