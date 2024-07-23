package com.interview.practice.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExampleViaLambda {


    public static void main(String[] args) {

        Predicate<Integer> predicate = t -> t % 2 == 0;

        System.out.println(predicate.test(10));


        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        integers.stream().filter(predicate).forEach(System.out::println);
    }
}

