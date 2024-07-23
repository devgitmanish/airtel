package com.interview.practice.epam.execution;


 /*
 Find the lowest model of cheapest price car from given list of cars. you can use
 java 8 streams.
  */

import com.interview.practice.epam.model.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Question1 {

    public static void main(String[] args) {

        List<Car> list = new ArrayList<>();
        list.add(new Car(1999, 5000.0));
        list.add(new Car(1999, 50000.0));
        list.add(new Car(2022, 10000.0));
        list.add(new Car(2022, 1000.0));

        Optional<Car> min = list.stream()
                .min(Comparator.comparing(Car::getPrice));
        min.ifPresent(System.out::println);


    }
}
