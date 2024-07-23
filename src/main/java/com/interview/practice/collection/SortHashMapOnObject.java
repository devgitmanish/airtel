package com.interview.practice.collection;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

public class SortHashMapOnObject {

    public static void main(String[] args) {

        Map<Employee, String> map = new HashMap<>();
        map.put(new Employee("manish", 5000), "ram");
        map.put(new Employee("alex", 3000), "laxman");
        map.put(new Employee("ram", 2000), "alex");
        map.put(new Employee("ramesh", 4000), "ramesh");
        map.put(new Employee("laxman", 1000), "yadav");

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
                .forEach(System.out::println);

        System.out.println("------------------------------------------");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

        System.out.println("---emoloyee whose salary greater then 3000---when you required map----");

        Map<Employee, String> collect = map.entrySet()
                .stream()
                .filter(x -> x.getKey().getSalary() > 3000)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("---emoloyee whose salary greater then 3000---when you only employee name----");

        map.entrySet()
                .stream()
                .filter(x -> x.getKey().getSalary() > 3000)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                .forEach((key, value) -> {
                    System.out.println("Employee Name "+value + " Salary "+key.getSalary());
                });



    }
}

@Data
@AllArgsConstructor
class Employee {

    private String name;
    private double salary;

}
