package com.interview.practice.SolidPrincipal.DependencyInversion.Solution;

public class DebitCard implements BankCard {

    public void doTransaction(){
        System.out.println("Debit card transaction");

    }
}
