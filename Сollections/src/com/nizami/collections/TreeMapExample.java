package com.nizami.collections;

import com.nizami.iterateCollections.IterateMap;
import com.nizami.objects.Car;

import java.util.TreeMap;

public class TreeMapExample extends IterateMap {
    public static void treeMapExample() {
        //sorted
        TreeMap<String, Car> treeMap = new TreeMap<String, Car>();

        treeMap.put("test", new Car("Toyota"));
        treeMap.put("key", new Car("BMW"));
        treeMap.put("niva", new Car("Niva"));
        treeMap.put("car", new Car("Lexus"));
        treeMap.put("test", new Car("Audi"));//дублированный ключ - происходит замена

        iterateMap(treeMap);

        System.out.println("higherKey = " + treeMap.higherKey("car"));
        System.out.println("lowerEntry = " + treeMap.lowerEntry("key"));
    }
}