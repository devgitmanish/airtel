package com.interview.practice.DesignPattern.ChainOfResponsibilityDesignPattern;

public class CreditCardPaymentHandler extends PaymentHandler{

    @Override
    public void handlePayment(double amount) {

        if(amount <=1000)
            System.out.println("Paid using credit card $ "+amount);
        else
            chain.handlePayment(amount);

    }
}
