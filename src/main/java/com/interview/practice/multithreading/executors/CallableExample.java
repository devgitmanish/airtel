package com.interview.practice.multithreading.executors;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/*
  invokeAll -> taking listOfCollection, CallableObject
  invokeAny -> taking listOfCollection, CallableObject
  ------------------------------------------
  execute ->return type void taking runnable object
  submit -> return type Future Object takeing runnable and callable
   */
class Task implements Runnable {
    public void run() {
        System.out.println("Task executed");
    }
}
public class CallableExample {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(new Task());

        ExecutorService executorService1 = Executors.newCachedThreadPool();
        executorService1.submit(new Task());



    }
}



