package com.interview.practice.SolidPrincipal.DependencyInversion.Solution;

public class ExecutePayment {

    public void executePayment(BankCard bankCard){
        bankCard.doTransaction();
    }
}
