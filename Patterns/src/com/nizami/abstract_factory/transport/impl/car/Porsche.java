package com.nizami.abstract_factory.transport.impl.car;

import com.nizami.abstract_factory.transport.intefaces.Car;

public class Porsche implements Car{
    @Override
    public void drive() {
        System.out.println("Drive speed 140km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 1 sec");
    }
}
