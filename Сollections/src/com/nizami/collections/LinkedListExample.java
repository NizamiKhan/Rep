package com.nizami.collections;

import com.nizami.objects.Car;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void linkedListExample() {
        java.util.LinkedList<Car> cars = new LinkedList();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Toyota");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        cars.addLast(car1);
        cars.addFirst(car1);
        cars.removeLast();
        cars.removeFirst();


        Iterator<Car> iterator = cars.descendingIterator();//итератор в обратную сторону
//        Iterator<Car> iterator=cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}