package com.interview.practice.DesignPattern.FacadeDesignPattern.resturantImpl;

import com.interview.practice.DesignPattern.FacadeDesignPattern.resturant.DeliveryTeam;

public class DeliveryTeamImpl implements DeliveryTeam {

    @Override
    public void assignDeliveryBoy() {
        System.out.println("Assign Deliver Partner : Delivery Boy");
    }
}
