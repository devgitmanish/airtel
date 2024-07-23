package com.interview.practice.abstractInterface.abstractwithoutconstructor;

public abstract class Phone {

    //public static String phoneType="android";

    public String phoneType="android";

    Phone() {
        System.out.println("Default Constructor : "+ this.phoneType);
    }

//    Phone(String phoneType) {
//        this.phoneType = phoneType;
//    }

    public void phoneChargeWithOutAbstract() {
        System.out.println("phone charged From Abstract Class "+this.phoneType);
    }

    public String valueReturn() {
        return this.phoneType;
    }

    public abstract void phoneChargeWithAbstract();

}
