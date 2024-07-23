package com.interview.practice.functionalInterface;

import java.util.function.Consumer;

public class ConsumerExampleViaLambda {

    public static void main(String[] args) {

        Consumer<String> consumer = x -> System.out.println("printing "+x);

        consumer.accept("Manish");

    }
}
