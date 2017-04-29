package com.nizami.abstract_factory.factory.impl;

import com.nizami.abstract_factory.factory.interfaces.TransportFactory;
import com.nizami.abstract_factory.transport.impl.aircraft.Boing;
import com.nizami.abstract_factory.transport.impl.car.Porsche;
import com.nizami.abstract_factory.transport.intefaces.Aircraft;
import com.nizami.abstract_factory.transport.intefaces.Car;

public class USAFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boing();
    }
}
