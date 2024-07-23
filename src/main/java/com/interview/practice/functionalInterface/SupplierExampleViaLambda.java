package com.interview.practice.functionalInterface;

import java.util.function.Supplier;

public class SupplierExampleViaLambda  {


    public static void main(String[] args) {

        Supplier<String> supplier = () -> {
            return "manish";
        };

        System.out.println(supplier.get());

    }
}
