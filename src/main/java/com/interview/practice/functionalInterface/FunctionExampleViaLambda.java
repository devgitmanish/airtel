package com.interview.practice.functionalInterface;

import java.util.function.Function;

public class FunctionExampleViaLambda{

    public static void main(String[] args) {

        Function<Integer, Integer> function = x -> x*10;
        System.out.println(function.apply(10));
    }

}
