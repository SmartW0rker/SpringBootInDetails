package com.spring_boot_learning.coreBeans.vehicle;

public class Car implements Vehicle {

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
            System.out.println("Car go right");
        }
    }

    @Override
    public void goLeft() {
        if (running) {
            System.out.println("Car go left");
        }
    }

    @Override
    public void goBack() {
        if (running) {
            System.out.println("Car go back");
        }
    }

    @Override
    public void goForward() {
        if (running) {
            System.out.println("Car go forward");
        }
    }
}
