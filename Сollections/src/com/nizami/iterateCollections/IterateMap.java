package com.nizami.iterateCollections;

import com.nizami.objects.Car;

import java.util.Iterator;
import java.util.Map;

public class IterateMap {
    protected static void iterateMap(Map map) {
        System.out.println();
        Iterator<Map.Entry<String, Car>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Car> carEntry = iterator.next();
            System.out.println(carEntry.getKey() + " - " + carEntry.getValue());
        }
    }
}