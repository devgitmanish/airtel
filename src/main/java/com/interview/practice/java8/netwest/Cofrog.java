package com.interview.practice.java8.netwest;

import com.interview.practice.java8interview.model.EmployeeCoforge;

import java.util.*;
import java.util.stream.Collectors;

public class Cofrog {

    public static void nHighestSalaryOnByMaxAge(List<Employee> empList, int num) {

        Map.Entry<Integer, List<Integer>> integerListEntry = empList.stream()
                .collect(Collectors.groupingBy(Employee::getSalary,
                        Collectors.mapping(Employee::getAge,
                                Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .toList()
                .get(num - 1);
        Optional<Integer> maxAge = integerListEntry.getValue().stream().max(Integer::compareTo);

        empList.stream()
                .filter(x -> x.getSalary()==integerListEntry.getKey()
                        && x.getAge()==maxAge.get())
                .forEach(System.out::println);

    }

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(103, "ravi", 5000, 15));

        empList.add(new Employee(100, "charan", 10000, 35));
        empList.add(new Employee(100, "rama", 10000, 45));
        empList.add(new Employee(101, "vinod", 10000, 25));

        empList.add(new Employee(107, "kumar", 20000, 35));

        empList.add(new Employee(110, "navi", 30000, 55));
        empList.add(new Employee(110, "abc", 30000, 65));
        empList.add(new Employee(110, "dummy", 30000, 75));

        nHighestSalaryOnByMaxAge(empList, 1);

    }
}
