package com.interview.practice.DesignPattern.ChainOfResponsibilityDesignPattern;

public abstract class PaymentHandler {

    protected PaymentHandler chain;

    public void setChain(PaymentHandler chain) {
        this.chain = chain;
    }

    public abstract void handlePayment(double amount);
}
