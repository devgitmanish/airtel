package com.interview.practice.SolidPrincipal.DependencyInversion.Solution;

public class CreditCard implements BankCard{

    public void doTransaction(){
        System.out.println("Credit card transaction");

    }
}
