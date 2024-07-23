package com.interview.practice.ParkingDesign.service;

import com.interview.practice.ParkingDesign.exception.ParkingFullException;
import com.interview.practice.ParkingDesign.model.Ticket;
import com.interview.practice.ParkingDesign.model.Vehicle;

public interface Parking {

    public Ticket park(Vehicle vehicle) throws ParkingFullException;
}
