package com.interview.practice.DesignPattern.DecoratorDesignPattern;

public class CosmaticTreatement extends InsuranceTopUpDecorator{


    public CosmaticTreatement(HealthInsurance healthInsurance) {
        super(healthInsurance);
    }

    public String basicHealthInsurance(){
        return healthInsurance.basicHealthInsurance() + cosmaticTreatement();
    }

    public String cosmaticTreatement(){
        return " commatic Treatement added";
    }
}

