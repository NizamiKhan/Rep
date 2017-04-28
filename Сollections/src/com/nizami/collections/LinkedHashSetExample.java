package com.nizami.collections;

import java.util.*;

public class LinkedHashSetExample {

    //ordered
    public static void linkedHashSetExample() {

        Set<Integer> set = new LinkedHashSet();
        set.add(34);
        set.add(112);
        set.add(52);
        set.add(55);
        set.add(313);
        set.add(76);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
