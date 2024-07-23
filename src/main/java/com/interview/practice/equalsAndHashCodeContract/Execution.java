package com.interview.practice.equalsAndHashCodeContract;

public class Execution {

    public static void main(String[] args) {

        Employee emp1 = new Employee(11, "manish");
        Employee emp2 = new Employee(11, "manish");


        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
        System.out.println(emp1==emp2);
        System.out.println(emp1.equals(emp2));

        /*
        We we comment the hash code
         */

        Student st1 = new Student(11, "manish");
        Student st2 = new Student(11, "manish");
        System.out.println("==========Comment Hash Code ==========");
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st1==st2);
        System.out.println(st1.equals(st2));
    }
}
