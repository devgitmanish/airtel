package com.interview.practice.shallowDeepClonning.deep;

public class Main {


    public static void main(String[] args) {
        Address address = new Address();
        address.setCity("gurgaon");
        address.setCountry("india");

        Employee employee1 = new Employee("manish", "male", address);
        Employee employee2 = employee1.clone();

        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());

        employee2.getAddress().setCity("agra");
        employee2.setName("harish");

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
