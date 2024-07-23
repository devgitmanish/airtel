package com.interview.practice.epam.execution;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
String strSentence = " HI EPAM bYe EPAM goodbye EPAM welcome ePAM Hi There epAM BYE bye EPaM";
Find the words present in the string more than once along with their occurrences
 */
public class Question5 {

    public static void main(String[] args) {

        String strSentence = " HI EPAM bYe EPAM goodbye EPAM welcome ePAM Hi There epAM BYE bye EPaM";

        Arrays.asList(strSentence.toLowerCase().split("\\s+"))
                .stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .forEach(System.out::println);


        Arrays.stream(strSentence.toLowerCase().split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .forEach(System.out::println);

    }
}
