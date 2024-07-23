package com.interview.practice.ParkingDesign.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Slot {

    private int number;
    private boolean isEmpty;
    private Vehicle parkVehicle;

    public Slot(int number) {
        this.number = number;
    }
    public void vacateSlot() {
        parkVehicle = null;
        this.isEmpty = true;
    }
    public void occupySlot(Vehicle parkVehicle) {
        this.parkVehicle = parkVehicle;
        this.isEmpty = false;
    }
    public Integer getSlotNumber() {
        return number;
    }
}
