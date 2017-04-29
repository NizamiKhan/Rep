package com.nizami.abstract_factory.factory.impl;

import com.nizami.abstract_factory.factory.interfaces.TransportFactory;
import com.nizami.abstract_factory.transport.impl.aircraft.TU134;
import com.nizami.abstract_factory.transport.impl.car.Niva;
import com.nizami.abstract_factory.transport.intefaces.Aircraft;
import com.nizami.abstract_factory.transport.intefaces.Car;

public class RussianFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }
}
