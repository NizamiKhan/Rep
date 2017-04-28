package com.nizami.comparators;

import com.nizami.objects.Car;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {
    public static void sortTest() {
        ArrayList<Car> cars = addCars();

        System.out.println(cars);//до сортировки

        Collections.sort(cars);//сортировка через интерфейс Comparable, реализованный в Car
        System.out.println(cars);

        Collections.sort(cars, new CarYearComparator());//сортировка через Comparator по году
        System.out.println(cars);

        Collections.sort(cars, new CarNameComparator());//сортировка через Comparator по имени
        System.out.println(cars);
    }

    private static ArrayList<Car> addCars() {
        ArrayList<Car> cars = new ArrayList<>();

        Car car1 = new Car("BMW", 1999);
        Car car2 = new Car("NIVA", 2004);
        Car car3 = new Car("Opel", 2013);
        Car car4 = new Car("Nissan", 1990);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        return cars;
    }
}
