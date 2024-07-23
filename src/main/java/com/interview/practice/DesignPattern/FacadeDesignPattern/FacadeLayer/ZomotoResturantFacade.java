package com.interview.practice.DesignPattern.FacadeDesignPattern.FacadeLayer;

import com.interview.practice.DesignPattern.FacadeDesignPattern.resturant.DeliveryBoy;
import com.interview.practice.DesignPattern.FacadeDesignPattern.resturant.DeliveryTeam;
import com.interview.practice.DesignPattern.FacadeDesignPattern.resturant.Resturant;

public class ZomotoResturantFacade {

    private Resturant resturant;
    private DeliveryTeam deliveryTeam;
    private DeliveryBoy deliveryBoy;


    public void placeOrder(){
        resturant.prepareOrder();
        deliveryTeam.assignDeliveryBoy();
        deliveryBoy.pickUpOrder();
        deliveryBoy.deliverOrder();
    }
}
