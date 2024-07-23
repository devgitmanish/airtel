package com.interview.practice.SolidPrincipal.SingleResponsibility;

import java.math.BigDecimal;

/*
Single responsibility : whatever the class that we create all those classes should have
only one responsibility and that responsibility only should be followed by particular class.

let me give you a example what i am trying to say....
 */

public class Main {
    public static void main(String[] args) {

        AccountOperation accountOperation = new AccountOperation();

        accountOperation.addAccount(Account.builder()
                .accountNumber(1234)
                .firstName("Alex")
                .totalAmount(BigDecimal.valueOf(200000.00))
                .build());

        accountOperation.addAccount(Account.builder()
                .accountNumber(5678)
                .firstName("BOB")
                .totalAmount(BigDecimal.valueOf(500000.00))
                .build());

        TransactionOperations transactionOperations = new TransactionOperations();
        transactionOperations.deposit(BigDecimal.valueOf(100000), 1234);

        System.out.println(accountOperation.getAccount(1234));

        transactionOperations.withDraw(BigDecimal.valueOf(100000), 5678);
        System.out.println(accountOperation.getAccount(5678));


    }
}
