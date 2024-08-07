package com.interview.practice.sapient.java8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VarunJain {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(11, "manish", 2001));
        list.add(new Student(12, "alok", 2002));
        list.add(new Student(13, "harish", 2001));
        list.add(new Student(15, "parmod", 2002));

        /* when it is asking no of count then go for Collectors.counting(); */

        Map<Integer, Long> collect = list.stream()
                .collect(Collectors.groupingBy(Student::getYob,
                        Collectors.counting()));
        collect.forEach((key,value) -> {
            System.out.println(" YOB "+key + " Count "+value);
        });
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Student{
    private int id;
    private String name;
    private int yob;

}
