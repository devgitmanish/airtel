package com.interview.practice.SolidPrincipal.InterfaceSegreation.Problem;

public class Paytm implements UPIPayment {


    @Override
    public void payMoney() {

    }

    @Override
    public void scratchCard() {

    }

    @Override
    public void getCashBackAsCreditBalance() {
        /* this feature is not supported by Paytm */
    }
}
