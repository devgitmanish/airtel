package com.interview.practice.DesignPattern.ChainOfResponsibilityDesignPattern;

public class Main {

    /* CHAIN OF RESPONSIBILITY DESIGN PATTERN */
        /*
          Chain of Responsibility is a behavioral design pattern that lets
          you pass requests along a chain of handlers. Upon receiving a request,
          each handler decides either to process the request or to pass it to the next handler in the chain.
        */

    public static void main(String[] args) {

        PaymentHandler bank = new BankPaymentHandler();
        PaymentHandler creditCard = new CreditCardPaymentHandler();
        PaymentHandler payPal = new PayPalPaymentHandler();

        bank.setChain(creditCard);
        creditCard.setChain(payPal);

        bank.handlePayment(600);
        bank.handlePayment(200);
        bank.handlePayment(1200);
        bank.handlePayment(600);

    }
}
