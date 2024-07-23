package com.interview.practice.SolidPrincipal.SingleResponsibility;

import java.util.HashMap;
import java.util.Map;

public class AccountOperation {

    public static Map<Integer, Account> accountMap = new HashMap<>();

    public void addAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }

    public void updateAccount(Account account) {
        accountMap.put(account.getAccountNumber(), account);
    }

    public Account getAccount(int accountNumber) {
        return accountMap.get(accountNumber);
    }

    /* move this method to different class
     * these are transactional operation like depositAccount withdrawAccount
     * this is breaking our single responsibility principal */

    public void depositAccount(int amount, int accountNumber) {

    }
}
