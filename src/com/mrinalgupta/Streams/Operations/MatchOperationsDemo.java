package com.mrinalgupta.Streams.Operations;

import java.util.List;

public class MatchOperationsDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 5, 6, 3, 8, 9);

        // matching operations
        boolean b1 = list.stream().anyMatch(n -> n % 2 == 0); //true if any one matches predicate and false for empty stream
        System.out.println("any match : " + b1);
        boolean b2 = list.stream().allMatch(n -> n % 2 == 0); // true iff all matches predicate
        System.out.println("all match : " + b2);
        boolean b3 = list.stream().noneMatch(n -> n % 2 == 0); // true iff none matches the predicate and for empty stream
        System.out.println("none match : " + b3);
    }
}
