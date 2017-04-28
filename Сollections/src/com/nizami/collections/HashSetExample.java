package com.nizami.collections;

import com.nizami.objects.Car;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {//not ordered

    public static void hashSetExample() {
        Set<Car> cars = new HashSet<Car>();
        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Nissan");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);//добавление дупликата

        //проход по коллекции с помощью итератора
        Iterator<Car> iterator = cars.iterator();
        //not ordered - порядок получения не такой же, как порядок вставки
        while (iterator.hasNext()) {
            Car car = iterator.next();
            System.out.println(car.getName());
        }
    }
}