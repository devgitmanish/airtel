package com.interview.practice.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample implements Consumer<String>{


    public void accept(String str){
        System.out.println("Printing "+str);
    }

    public static void main(String[] args) {

        ConsumerExample example = new ConsumerExample();
        example.accept("Manish");

    }
}
