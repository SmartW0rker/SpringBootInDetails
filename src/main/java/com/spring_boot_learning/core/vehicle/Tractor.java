package com.spring_boot_learning.core.vehicle;

import com.spring_boot_learning.core.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("TractorQualifier")
public class Tractor implements Vehicle {

    private Boolean running;
    @Override
    public boolean startEngine() {
        running=true;
        return true;
    }

    @Override
    public boolean stopEngine() {
        running=false;
        return false;
    }

    @Override
    public void goRight() {
        if (running) {
            System.out.println("Tractor go right");
        }
    }

    @Override
    public void goLeft() {
        if (running) {
            System.out.println("Tractor go left");
        }
    }

    @Override
    public void goBack() {
        if (running) {
            System.out.println("Tractor go back");
        }
    }

    @Override
    public void goForward() {
        if (running) {
            System.out.println("Tractor go forward");
        }
    }
}
