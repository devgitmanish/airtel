package com.interview.practice.abstractInterface.abstractwithoutconstructor;

public class Iphone extends Phone {

//    Iphone(String phoneType) {
//        super(phoneType);
//    }

    Iphone(){
        super();
    }

    @Override
    public void phoneChargeWithAbstract() {
        System.out.println("Normal Implementation provided to abstract Method");
    }

    public static void main(String[] args) {

        //Phone phone = new Iphone("android");
        Phone phone = new Iphone();
        //System.out.println(Phone.phoneType);
        Phone phone1 = new Phone() {
            @Override
            public void phoneChargeWithAbstract() {
                System.out.println("manish");
            }
        };

        phone.phoneChargeWithAbstract();

        phone.phoneChargeWithOutAbstract();

        phone1.phoneChargeWithAbstract();


    }
}
