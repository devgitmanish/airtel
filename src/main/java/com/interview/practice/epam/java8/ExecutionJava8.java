package com.interview.practice.epam.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
problem statement
Write a program that takes a list of integers, filters out the even numbers,
 squares each remaining number, and then calculates the sum of the squared numbers.
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
 */
public class ExecutionJava8 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(rem -> rem * rem)
                .sum();

        numbers.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(rem -> rem * rem)
                        .forEach(System.out::println);


        //System.out.println(sum);


    }
}
