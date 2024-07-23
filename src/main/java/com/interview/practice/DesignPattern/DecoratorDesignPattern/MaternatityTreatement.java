package com.interview.practice.DesignPattern.DecoratorDesignPattern;

public class MaternatityTreatement extends InsuranceTopUpDecorator{

    public MaternatityTreatement(HealthInsurance healthInsurance) {
        super(healthInsurance);
    }

    public String basicHealthInsurance(){
        return healthInsurance.basicHealthInsurance()+maternatityTreatment();
    }

    public String maternatityTreatment(){
        return " maternatity Treatement added";
    }
}
