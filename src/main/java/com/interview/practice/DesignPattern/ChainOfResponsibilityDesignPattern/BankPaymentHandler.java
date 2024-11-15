package com.interview.practice.DesignPattern.ChainOfResponsibilityDesignPattern;

public class BankPaymentHandler extends PaymentHandler {

    @Override
    public void handlePayment(double amount) {

        if (amount <= 500)
            System.out.println("Paid using bank account $ " + amount);
        else
            chain.handlePayment(amount);
    }
}
