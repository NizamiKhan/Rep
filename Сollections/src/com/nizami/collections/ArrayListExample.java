package com.nizami.collections;

import com.nizami.objects.Car;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    //ordered
    public static void arrayListExample() {
        java.util.ArrayList<Car> cars = new ArrayList<Car>();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Nissan");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);//добавление дупликата (разрещено)
        cars.add(new Car("Toyota"));//создание обьекта в месте добавления

        System.out.println("size: " + cars.size());
        System.out.println("cars.contains(car1) = " + cars.contains(car1));//содержит ли коллекция этот обьект

        int index = cars.indexOf(car3);
        System.out.println("index = " + index);//получение индекса элемента (индексация с нуля)

        Car selectedCar = cars.get(3);
        System.out.println("selectedCar = " + selectedCar.getName());

        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

        cars.clear();//очистка коллекции
        System.out.println("isEmpty = " + cars.isEmpty());//пустая ли коллекция
    }
}