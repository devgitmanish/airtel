package com.interview.practice.epam.execution;



import com.interview.practice.epam.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/* Find the list of employees in each department. Use java 8 streams syntax.*/
public class Question2 {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(101, "laxman", "IT", 32, "male"));
        studentList.add(new Student(105, "ram", "IT", 34, "male"));
        studentList.add(new Student(109, "alex", "HR", 33, "male"));
        studentList.add(new Student(104, "john", "Accounts", 32, "male"));
        studentList.add(new Student(103, "manish", "HR", 35, "male"));
        studentList.add(new Student(107, "alok", "Facility", 37, "male"));

        Map<String, List<Student>> collect = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.toList()));

        collect.entrySet()
                .stream()
                .forEach(x -> {
                    System.out.println("Department "+x.getKey() + " Students "+x.getValue());
                });


    }
}
