package com.interview.practice.DesignPattern.ChainOfResponsibilityDesignPattern;

public class PayPalPaymentHandler extends PaymentHandler{

    @Override
    public void handlePayment(double amount) {
        if(amount <=1500)
            System.out.println("Paid using paypal gateway $ "+amount);
        else
            chain.handlePayment(amount);
    }
}
