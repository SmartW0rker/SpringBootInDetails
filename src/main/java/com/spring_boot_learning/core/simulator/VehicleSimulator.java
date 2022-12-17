package com.spring_boot_learning.core.simulator;

import com.spring_boot_learning.core.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleSimulator {
    private Vehicle vehicle;

    public VehicleSimulator(@Qualifier("TractorQualifier") Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void simulate(){
        vehicle.startEngine();
        vehicle.goForward();
        vehicle.goLeft();
        vehicle.goRight();
        vehicle.goBack();
        vehicle.stopEngine();
    }
}
