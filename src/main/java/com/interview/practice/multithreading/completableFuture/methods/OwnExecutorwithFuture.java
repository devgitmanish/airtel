package com.interview.practice.multithreading.completableFuture.methods;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class OwnExecutorwithFuture {

    public static void main (String[]args){

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        /* Then Apply */
        CompletableFuture<List<Integer>> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Method");
            return Arrays.asList(1, 2, 3, 4, 5);
        }, executorService).thenApply(result -> result
                .stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList()));
        System.out.println(future.join());

        /* Then Run don't want to return any thing */

        /* Then Accept */
        CompletableFuture.supplyAsync(() -> Arrays.asList(1, 2, 3, 4, 5))
                .thenApply(result -> result
                        .stream()
                        .filter(x -> x % 2 == 0)
                        .collect(Collectors.toList()))
                .thenAccept((emails) -> {
                    emails.forEach(email -> sendEmail(email));
                });
    }
    private static void sendEmail(int emailcount) {
        System.out.println("Sending email " + emailcount);
    }
}


