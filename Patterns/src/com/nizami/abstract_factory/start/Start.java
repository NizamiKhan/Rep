package com.nizami.abstract_factory.start;

import com.nizami.abstract_factory.factory.impl.RussianFactory;
import com.nizami.abstract_factory.factory.impl.USAFactory;
import com.nizami.abstract_factory.factory.interfaces.TransportFactory;
import com.nizami.abstract_factory.transport.intefaces.Aircraft;
import com.nizami.abstract_factory.transport.intefaces.Car;

import java.util.Scanner;

public class Start {

    private static TransportFactory transportFactory;

    public static void main(String[] args) {

        SelectFactory();

        Car car = transportFactory.createCar();
        Aircraft aircraft = transportFactory.createAircraft();

        car.drive();
        car.stop();
        aircraft.flight();
    }

    private static void SelectFactory() {

        int key;
        System.out.println("Выберите: ");
        System.out.println("1. USA ");
        System.out.println("2. RUSSIAN ");

        Scanner scanner = new Scanner(System.in);
        key = scanner.nextInt();

        if (key == 1) {
            transportFactory = new USAFactory();
        } else if (key == 2) {
            transportFactory = new RussianFactory();
        }
    }
}
