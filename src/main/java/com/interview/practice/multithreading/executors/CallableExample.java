package com.interview.practice.multithreading.executors;

import org.aspectj.weaver.ast.Call;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.*;

/*
  invokeAll -> taking listOfCollection, CallableObject
  invokeAny -> taking listOfCollection, CallableObject
  ------------------------------------------
  execute ->return type void taking runnable object
  submit -> return type Future Object taking runnable and callable
   */
class Task implements Callable<Integer> {

    public Integer call() {
       return returnNumber(5);
    }
    public int returnNumber(int i){
        return i;
    }
}
public class CallableExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Task t1 = new Task();

        ExecutorService executorService1 = Executors.newCachedThreadPool();
        Future<Integer> submit = executorService1.submit(t1);
        if(submit.get()!=null){
            Integer i = submit.get();
            System.out.println("Getting Value from Future Object " +i);
        }
        executorService1.shutdown();
    }
}



