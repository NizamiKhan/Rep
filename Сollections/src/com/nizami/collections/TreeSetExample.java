package com.nizami.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {//sorted

    public static void treeSetExample() {

        Set<Integer> tree = new TreeSet<Integer>();
        tree.add(34);
        tree.add(21);
        tree.add(12);
        tree.add(342);
        tree.add(23);
        tree.add(884);
        tree.add(12);//добавление дубликата

        Iterator<Integer> iterator = tree.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}