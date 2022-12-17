package com.spring_boot_learning.coreBeans.simulator;

import com.spring_boot_learning.coreBeans.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleSimulator {
    private Vehicle vehicle;

    public VehicleSimulator(Vehicle vehicle) {
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
