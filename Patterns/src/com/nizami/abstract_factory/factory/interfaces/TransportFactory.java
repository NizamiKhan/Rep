package com.nizami.abstract_factory.factory.interfaces;

import com.nizami.abstract_factory.transport.intefaces.Aircraft;
import com.nizami.abstract_factory.transport.intefaces.Car;

//фабрика по созданию транспортных средств
public interface TransportFactory {

    //что фабрика будет производить
    Car createCar();//авто

    Aircraft createAircraft();//самолеты
}
