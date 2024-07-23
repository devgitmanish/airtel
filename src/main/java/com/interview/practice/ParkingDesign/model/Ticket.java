package com.interview.practice.ParkingDesign.model;

import com.interview.practice.ParkingDesign.enums.VehicleType;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Ticket {

    private int slotNumber;
    private String vehicleNumber;
    private VehicleType vehicleType;
    private Date date;


    public int getSlotNumber() {
        return slotNumber;
    }
}
