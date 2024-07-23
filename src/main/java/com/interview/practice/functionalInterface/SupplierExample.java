package com.interview.practice.functionalInterface;

import java.util.function.Supplier;

public class SupplierExample implements Supplier<String> {

    public String get(){
        return "some-value";
    }

    public static void main(String[] args) {

        SupplierExample example = new SupplierExample();
        System.out.println(example.get());

    }
}
