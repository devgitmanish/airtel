package com.interview.practice.multithreading.completableFuture.exception;

import java.util.concurrent.CompletableFuture;

public class HandleExeception {


    public static void main(String[] args) {

        boolean flag = true;

        CompletableFuture<String> completableFuture =
                CompletableFuture.supplyAsync(() -> {
                    if (flag)
                        throw new RuntimeException("Exception occoured");
                        return "success";
                }).handle((s, e) -> {

                    if(e!=null){
                        System.out.println("Exception handled "+e.getMessage());
                        return "null";
                    }
                    return s;
                });
        System.out.println(completableFuture.join());

        System.out.println("==========================================");

        CompletableFuture<String> completableFuture1
                = CompletableFuture.supplyAsync(() ->{
                    if(false) throw new RuntimeException("Exception occoured 1");
                    return "executed successfully";
        }).exceptionally((ex)->{
            System.out.println("exception handled 1"+ex.getMessage());
            return "failure";
        });

        System.out.println("Result :"+completableFuture1.join());
    }
}
