package com.interview.practice.multithreading.completableFuture.methods;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class ExecutionThenCombine {

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

    public static CompletableFuture<String> getAddressDetails(){

        return CompletableFuture.supplyAsync(()->{
            System.out.println("Address details :: ");
            delay(3);
            return "Address details ::";
        });
    }

    public static void main(String[] args) {

        CompletableFuture<String> future =
                getUserDetails().thenCombine(getAddressDetails(), (user, address) -> {
                    System.out.println("Combined result "+ user + " address "+address);
                    return user+address;
                });

        System.out.println("main method ");
        System.out.println(future.join());
    }
}
