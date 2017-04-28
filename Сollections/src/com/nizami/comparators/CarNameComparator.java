package com.nizami.comparators;

import com.nizami.objects.Car;

import java.util.Comparator;
import java.util.List;

public class CarNameComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return car1.getName().compareTo(car2.getName());
    }


    public static <T extends Number &Comparable<T>>List<T> foo(List<T> lst, T value){
        if(lst !=null){
            lst.stream().forEach(element->{
                if (element !=null &&element.compareTo(value)>0){
                    result.add(element);
                }

            });
        }
    }
    re
}

