package com.interview.practice.ParkingDesign.model;

import com.interview.practice.ParkingDesign.enums.VehicleType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vehicle {

    private String vehicleNumber;
    private VehicleType vehicleType;

}
