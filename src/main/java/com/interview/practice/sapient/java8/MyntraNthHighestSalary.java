package com.interview.practice.sapient.java8;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;

public class MyntraNthHighestSalary {

    public static void secondHighestSalary(Map<Integer, Employee> employeeMap, int num) {

        Map<Double, List<String>> collect = employeeMap.values()
                .stream()
                .collect(Collectors.groupingBy(Employee::getSalary,
                        Collectors.mapping(Employee::getName,
                                Collectors.toList())));

        System.out.println(collect);
//                .entrySet()
//                .stream()
//                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
//                .toList()
//                .get(num - 1);

        //System.out.println("Way 2");
        //System.out.println(doubleListEntry);

    }

    public static void main(String[] args) {

        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(1, new Employee(101, "manish", 5000));
        employeeMap.put(2, new Employee(103, "ram", 4000));
        employeeMap.put(3, new Employee(102, "alex", 4000));
        employeeMap.put(4, new Employee(104, "saurav", 3000));
        employeeMap.put(5, new Employee(105, "alok", 2000));

        secondHighestSalary(employeeMap, 2);

        Map<String, Integer> map = new HashMap<>();
        map.put("manish", 1000);
        map.put("harish", 2000);
        map.put("girish", 3000);
        map.put("ram", 1000);
        /*
        name as a list Collectors.mapping(key me name aayega then, loList list bana deege
        { 1000=[manish, ram], 2000=[harish], 3000=[girish]}

        */
        Map<Integer, List<String>> collect = map.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
        System.out.println(collect);

        /* Just Fun */
        collect.entrySet().stream().filter(x -> x.getKey()==1000)
                .forEach(x -> System.out.println("Name "+ x.getValue()));


        List<Employee> list = new ArrayList<>();
        list.add(new Employee(11, "manish", 2000));
        list.add(new Employee(12, "alok", 5000));
        list.add(new Employee(13, "manish", 2000));

        Map<String, Double> collect1 = list.stream().collect(Collectors.groupingBy(Employee::getName,
                Collectors.summingDouble(Employee::getSalary)));

        collect1.forEach((key, value) ->{
            System.out.println("Employee Name "+ key);
            System.out.println("Salary sum  "+ value);
        });

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

