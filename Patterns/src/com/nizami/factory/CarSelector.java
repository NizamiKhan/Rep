package com.nizami.factory;

//фабрика по созданию авто
public class CarSelector {

    private static CarSelector instance;

    public static CarSelector getInstance() {
        if (instance == null) {
            instance = new CarSelector();
        }
        return instance;
    }

    private CarSelector() {
    }

    //фамбричный метод, создает нужный автомобиль
    public Car getCar(RoadType roadType) {

        Car car = null;
        switch (roadType) {
            case CITY:
                car = new Porsche();
                break;
            case OFF_ROAD:
                car = new Geep();
                break;
        }
        return car;
    }
}