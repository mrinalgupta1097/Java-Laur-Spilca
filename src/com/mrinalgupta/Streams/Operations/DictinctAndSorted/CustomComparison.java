package com.mrinalgupta.Streams.Operations.DictinctAndSorted;

import java.util.Comparator;
import java.util.stream.Stream;

public class CustomComparison {
    public static void main(String[] args) {
        Stream<Cat> s = Stream.of(
                new Cat(3),
                new Cat(1),
                new Cat(5),
                new Cat(4),
                new Cat(6)
        );
        System.out.println("-------natural  order comparison------");
//        s.sorted(Comparator.naturalOrder())
//                .forEach(cat -> System.out.println(cat.getAge()));

        System.out.println("-------reverse  order comparison------");
        s.sorted(Comparator.reverseOrder())
                .forEach(cat-> System.out.println(cat.getAge()));
    }
}
