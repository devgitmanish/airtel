package com.interview.practice.java8interview.cognizent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthSalary {

    public static void secondHighestSalary2(Map<Integer, Employee> employeeMap, int num) {
        Map.Entry<Double, List<String>> doubleListEntry =

                employeeMap.values()
                        .stream()
                        .collect(Collectors.groupingBy(Employee::getSalary,
                                Collectors.mapping(Employee::getName,
                                        Collectors.toList())))
                        .entrySet()
                        .stream()
                        .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                        .toList()
                        .get(num - 1);

        System.out.println("Way 2");
        System.out.println(doubleListEntry);
    }

    public static void main(String[] args) {

        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(1, new Employee(101, "manish", 5000));
        employeeMap.put(2, new Employee(103, "ram", 4000));
        employeeMap.put(3, new Employee(102, "alex", 4000));
        employeeMap.put(4, new Employee(104, "saurav", 3000));
        employeeMap.put(5, new Employee(105, "alok", 2000));

        secondHighestSalary2(employeeMap, 2);

    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Employee {

    private int id;
    private String name;
    private double salary;

}

