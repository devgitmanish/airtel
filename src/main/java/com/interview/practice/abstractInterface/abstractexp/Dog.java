package com.interview.practice.abstractInterface.abstractexp;

public class Dog extends Animal{

    Dog(int age) {
        super(age);
    }

    @Override
    public void makeSound() {
        System.out.println("bark bark....");
    }

    public static void main(String[] args) {
        Animal a = new Dog(20);

        a.makeSound();

        System.out.println(a.age);



    }
}
