package com.interview.practice.functionalInterface;

import java.util.function.Predicate;

public class PredicateExample implements Predicate<Integer> {

    public boolean test(Integer i) {
        if (i % 2 == 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        PredicateExample example = new PredicateExample();
        System.out.println(example.test(10));
    }
}
