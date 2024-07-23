package com.interview.practice.functionalInterface;

import java.util.function.Function;

public class FunctionExample implements Function<Integer, Integer> {


    public Integer apply(Integer i){
        return i*i;
    }

    public static void main(String[] args) {
        FunctionExample example = new FunctionExample();
        System.out.println(example.apply(10));
    }

}
