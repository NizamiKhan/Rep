package com.nizami.collections;

import com.nizami.iterateCollections.IterateMap;
import com.nizami.objects.Car;

import java.util.LinkedHashMap;

public class LinkedHashMapExample extends IterateMap {
    public static void linkedHashMapExample() {
        //ordered
        LinkedHashMap<String, Car> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("test", new Car("Toyota"));
        linkedHashMap.put("key", new Car("BMW"));
        linkedHashMap.put("niva", new Car("Niva"));
        linkedHashMap.put("car", new Car("Lexus"));

        iterateMap(linkedHashMap);
    }
}