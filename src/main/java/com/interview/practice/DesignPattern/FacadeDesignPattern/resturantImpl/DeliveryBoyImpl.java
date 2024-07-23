package com.interview.practice.DesignPattern.FacadeDesignPattern.resturantImpl;

import com.interview.practice.DesignPattern.FacadeDesignPattern.resturant.DeliveryBoy;

public class DeliveryBoyImpl implements DeliveryBoy {

    @Override
    public void pickUpOrder() {
        System.out.println("Order is PickedUp");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order is delivered");
    }
}
