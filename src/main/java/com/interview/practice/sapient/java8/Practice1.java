package com.interview.practice.sapient.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Practice1 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("manish", 1000);
        map.put("harish", 2000);
        map.put("akshat", 3000);
        map.put("golu", 3000);
        map.put("ankita", 1000);

        map.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))

                .forEach((key, value) -> System.out.println("Salary : "+key + " Employee "+value));

        /* 2nd Highest Salary */

        Map.Entry<Integer, List<String>> integerListEntry = map.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey,
                                Collectors.toList())))

                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(Map.Entry::getKey)))
                .toList()
                .get(1);

        System.out.println(integerListEntry);

        System.out.println("===============================================");

        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(1, new Employee(101, "manish", 5000));
        employeeMap.put(2, new Employee(103, "ram", 4000));
        employeeMap.put(3, new Employee(102, "alex", 4000));
        employeeMap.put(4, new Employee(104, "saurav", 3000));
        employeeMap.put(5, new Employee(105, "alok", 5000));

        Map<Integer, List<String>> collect = employeeMap.values()
                .stream()
                .collect(Collectors.groupingBy(Employee::getSalary,
                        Collectors.mapping(Employee::getName, Collectors.toList())));

        Map.Entry<Integer, List<String>> doubleListEntry = collect.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(Map.Entry::getKey)))
                .toList()
                .get(1);

        System.out.println(doubleListEntry);


        System.out.println("=========================");

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "manish", 2000));
        list.add(new Employee(2, "harish", 2000));
        list.add(new Employee(3, "girish", 1000));
        list.add(new Employee(4, "golu", 3000));
        list.add(new Employee(4, "akshat", 3000));

        Map<Integer, Long> collect1 = list.stream()
                .collect(Collectors.groupingBy(Employee::getSalary,
                        Collectors.counting()));
        System.out.println(collect1);

        System.out.println("============================");
        Map<Integer, List<String>> collect2 = list.stream()
                .collect(Collectors.groupingBy(Employee::getSalary,
                        Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(collect2);

    }
}

