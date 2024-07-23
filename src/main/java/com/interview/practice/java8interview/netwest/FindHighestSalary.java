package com.interview.practice.java8interview.netwest;

import com.interview.practice.java8interview.model.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindHighestSalary {

    public static void findSalaryGreaterThanX(Map<String, Employee> map) {

        map.entrySet()
                .stream()
                .filter(x -> x.getValue().getSalary() > 700000)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))

                .entrySet()
                .forEach(System.out::println);
    }


    public static void main(String[] args) {
        Map<String, Employee> map = new HashMap<>();
        map.put("one", new Employee(123, "manish", 32, 500000));
        map.put("two", new Employee(456, "ram", 34, 700000));
        map.put("three", new Employee(789, "hanu", 26, 800000));
        map.put("four", new Employee(113, "laxman", 37, 900000));
        map.put("five", new Employee(114, "alex", 43, 300000));
        findSalaryGreaterThanX(map);
    }
}
