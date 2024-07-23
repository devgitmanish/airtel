package com.interview.practice.DesignPattern.DecoratorDesignPattern;

public abstract class InsuranceTopUpDecorator implements HealthInsurance {

    protected HealthInsurance healthInsurance;


    public InsuranceTopUpDecorator(HealthInsurance healthInsurance){
        this.healthInsurance=healthInsurance;
    }

    public String basicHealthInsurance(){
        return healthInsurance.basicHealthInsurance();
    }
}
