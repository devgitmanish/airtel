package com.interview.practice.multithreading.completableFuture.methods;

import java.util.SplittableRandom;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class ExecutionThenCompose {

    public static void delay(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static CompletableFuture<String> getUserDetails(){

        return CompletableFuture.supplyAsync(()->{
            System.out.println("user details");
            delay(2);
            return "user details";
        });
    }

    public static CompletableFuture<String> getAddressDetails(String userDetails){

        return CompletableFuture.supplyAsync(()->{
            System.out.println("Address details :: "+userDetails);
            delay(3);
            return "Address details ::"+userDetails;
        });
    }

    public static void main(String[] args) {

        CompletableFuture<String> completableFuture
                = getUserDetails()
                .thenCompose(ExecutionThenCompose::getAddressDetails);

        System.out.println(completableFuture.join());
    }
}
