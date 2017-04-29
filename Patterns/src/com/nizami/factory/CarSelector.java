package com.nizami.factory;

//фабрика по созданию авто
public class CarSelector {

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