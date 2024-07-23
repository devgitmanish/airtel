package com.interview.practice.shallowDeepClonning.shallow;

public class Main {


    public static void main(String[] args) {
        /*
            By default its shallow clonning
            Shallow clonning - only just referece is copy not entire object and its value.

            if you change the value with the help of reference object value become changed

            to avoid this go to deep clonning (custom clonning)
         */
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
