package com.interview.practice.immutable;

public final class ImmutablePerson {
    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // If we want to perform any operation that results in a modification,
    // we return a new instance with the desired changes, leaving the original object unchanged

    public ImmutablePerson withName(String newName) {
        return new ImmutablePerson(newName, this.age);
    }

    public ImmutablePerson withAge(int newAge) {
        return new ImmutablePerson(this.name, newAge);
    }

    public static void main(String[] args) {
        ImmutablePerson person1 = new ImmutablePerson("John", 30);

        // Displaying initial state
        System.out.println("Initial State:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        // Creating a new instance with modified age
        ImmutablePerson person2 = new ImmutablePerson("manish", 22);

        // Displaying modified state
        System.out.println("\nModified State:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
    }
}

