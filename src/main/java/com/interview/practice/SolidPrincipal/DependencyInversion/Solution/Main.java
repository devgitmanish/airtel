package com.interview.practice.SolidPrincipal.DependencyInversion.Solution;

/* we should not have any dependency in any module which means our higher level module is not dependent
* in our low level module or vice versa
*
* we should design in such a way it should not have the dependency in each other on the differenct classes
* and objects */


public class Main {
    public static void main(String[] args) {
        ExecutePayment executePayment = new ExecutePayment();
        executePayment.executePayment(new CreditCard());
        executePayment.executePayment(new DebitCard());
    }
}
