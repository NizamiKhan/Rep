package com.nizami.collections;

import com.nizami.iterateCollections.IterateMap;
import com.nizami.objects.Car;

import java.util.HashMap;

public class HashMapExample extends IterateMap {
    //not ordered
    public static void  hashMapExample(){
        HashMap<String,Car> hashMap=new HashMap<>();

        hashMap.put("test",new Car("Toyota"));
        hashMap.put("key",new Car("BMW"));
        hashMap.put("niva",new Car("Niva"));
        hashMap.put("car",new Car("Lexus"));
        hashMap.put("test",new Car("Audi"));//дублированный ключ - происходит замена

        iterateMap(hashMap);
    }
}
