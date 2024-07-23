package com.interview.practice.DesignPattern.FacadeDesignPattern.resturantImpl;

import com.interview.practice.DesignPattern.FacadeDesignPattern.resturant.Resturant;

public class ResturantImpl implements Resturant {
    @Override
    public void prepareOrder() {
        System.out.println("Your order is prepared....");
    }
}
