package com.nizami.collections;

import com.nizami.objects.Car;

import java.util.*;

public class ArrayDequeExample {
    //реализация FIFO
    public static void arrayDequeFIFOExample() {
        Deque<Car> cars = new ArrayDeque<>();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Toyota");
        Car car5 = new Car("KIA");
        Car car6 = new Car("Mersedes");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);

        System.out.println("element() = " + cars.element().getName());//получение верхнего элемента без удаления из очереди
        System.out.println(cars);
        System.out.println("remove() = " + cars.removeFirst().getName());//получение верхнего элемента с удалением из очереди
        System.out.println(cars);
    }

    //реализация ез танцев LIFO бс бубном
    public static void arrayDequeLIFOExample() {
        Deque<Car> cars = new ArrayDeque<>();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Toyota");
        Car car5 = new Car("KIA");
        Car car6 = new Car("Mersedes");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);

        Iterator<Car> iterator = cars.iterator();
        for (Car car : cars) {
            System.out.print(iterator.next().getName() + " ");
        }
        System.out.println();

        while (!(iterator.hasNext())) {
            System.out.println(cars.pollLast().getName());
            if (cars.size() == 0) {
                System.out.println("Стек очищен! size() = " + cars.size());
                break;
            }
        }
    }

    //реализация LIFO из cars с помощью служебного метода Collections.asLifoQueue
    public static void arrayDequeConvertLIFOExample() {
        Deque<Car> cars = new ArrayDeque<>();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Toyota");
        Car car5 = new Car("KIA");
        Car car6 = new Car("Mersedes");


        Queue lifoQueue = Collections.asLifoQueue(cars);//теперь LIFO

        lifoQueue.add(car1);
        lifoQueue.add(car2);
        lifoQueue.add(car3);
        lifoQueue.add(car4);
        lifoQueue.add(car5);
        lifoQueue.add(car6);

        System.out.println(cars);

        System.out.println("element() = " + lifoQueue.element());
        System.out.println(cars);

        System.out.println("remove() = " + lifoQueue.remove());
        System.out.println(cars);
    }

}
