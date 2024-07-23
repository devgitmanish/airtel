package com.interview.practice.comparablevscomprator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompratorExec {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("manish", 333));
        list.add(new Student("manish", 111));
        list.add(new Student("alex", 222));
        list.add(new Student("boby", 444));

        list.forEach(x -> System.out.println(x.getName() + " " + x.getId()));

        list.sort(Comparator.comparing(Student::getName).thenComparing(Student::getId));

        System.out.println("========================");

        list.forEach(x -> System.out.println(x.getName() + " " + x.getId()));
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Student {

    private String name;
    private int id;

}
