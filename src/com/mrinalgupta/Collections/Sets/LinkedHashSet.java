package com.mrinalgupta.Collections.Sets;

import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> set1 = new java.util.LinkedHashSet<>();
        addToSet(set1);


    }

    static void addToSet(Set<Integer> set1) {
        set1.add(10);
        set1.add(1000);
        set1.add(23);
        set1.add(1000); // does not add to collection
        set1.add(300);
        set1.add(256);
        set1.forEach(System.out::println);
    }
}
