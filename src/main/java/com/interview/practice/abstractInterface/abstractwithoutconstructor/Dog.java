package com.interview.practice.abstractInterface.abstractwithoutconstructor;



public class Dog extends Animal{

    public Dog(){
        super();
    }

    public static void main(String[] args) {


        //Abstract class can not be intansiated ... we do gives compliation error
        //Animal animal = new Animal();

        Animal animal = new Dog();




    }
}
