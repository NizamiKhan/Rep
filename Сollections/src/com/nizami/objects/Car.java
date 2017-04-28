package com.nizami.objects;

public class Car implements Comparable<Car> {
    private String name;
    private int year;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        return name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Car car) {
        return this.name.compareTo(car.getName());
    }
}
