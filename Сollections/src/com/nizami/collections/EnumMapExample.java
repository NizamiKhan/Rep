package com.nizami.collections;

import com.nizami.enums.CarType;
import com.nizami.objects.Car;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public class EnumMapExample {
    static void enumMapExample() {
        List<Car> minivanCars = new ArrayList<Car>();
        minivanCars.add(new Car("Toyota"));
        minivanCars.add(new Car("BMW"));

        List<Car> sportCars = new ArrayList<Car>();
        sportCars.add(new Car("Lexus"));
        sportCars.add(new Car("Audi"));

        EnumMap<CarType, List<Car>> enumMap = new EnumMap<CarType, List<Car>>(CarType.class);

        enumMap.put(CarType.MINIVAN, minivanCars);
        enumMap.put(CarType.SPORT, sportCars);

        System.out.println(enumMap.get(CarType.SPORT));
    }
}