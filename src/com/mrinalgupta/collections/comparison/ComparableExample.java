package com.mrinalgupta.collections.comparison;


import java.util.Set;

public class ComparableExample {
    public static void main(String[] args) {
        Set<Cat> set1 = new java.util.TreeSet<>();
        set1.add(new Cat(4));
        set1.add(new Cat(1));
        set1.add(new Cat(6));
        set1.add(new Cat(2));

        set1.forEach(System.out::println);
        //will get a class cast exception because Java does not how to sort Cat for treeset creation
    }
}
