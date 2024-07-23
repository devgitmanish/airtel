package com.interview.practice.SolidPrincipal.SingleResponsibility;

import java.math.BigDecimal;

public class TransactionOperations {

    public void deposit(BigDecimal amount, int accountNumber) {

        Account account = AccountOperation.accountMap.get(accountNumber);
        account.setTotalAmount(account.getTotalAmount().add(amount));
    }

    public void withDraw(BigDecimal amount, int accountNumber) {

        Account account = AccountOperation.accountMap.get(accountNumber);
        account.setTotalAmount(account.getTotalAmount().subtract(amount));

    }
}
