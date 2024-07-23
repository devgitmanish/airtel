package com.interview.practice.SolidPrincipal.DependencyInversion.Problem;



public class ShoppingMall {

    private DebitCard debitCard;
    private CreditCard creditCard;


    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public ShoppingMall(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void doPurchase(){
        //debitCard.doTransaction();
        creditCard.doTransaction();
    }



    public static void main(String[] args) {
//        ShoppingMall shoppingMall1 = new ShoppingMall(new DebitCard());
//        shoppingMall1.doPurchase();

        ShoppingMall shoppingMall2 = new ShoppingMall(new CreditCard());
        shoppingMall2.doPurchase();

    }
}
