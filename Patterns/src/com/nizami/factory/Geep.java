package com.nizami.factory;

public class Geep implements Car {
    @Override
    public void drive() {
        System.out.println("Drive speed 50km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 5 sec");
    }
}
