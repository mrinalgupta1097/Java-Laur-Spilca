package com.mrinalgupta.Streams.Collectors.SumAverage;

import java.util.List;
import java.util.stream.Collectors;

public class SumDemo {
    public static void main(String[] args) {
        /*
         * summingInt() -> produce an IntStream that represents the cumulative sum of elements in a stream of primitive int values
         * summingLong()
         * summingDouble()
         */
        List<String> list = List.of("AAA", "B", "CCCCC", "DDDD", "FFFFFF", "AAA");
        System.out.println("Primitive streams : " + list.stream()
                //("AAA", "B", "CCCCC", "DDDD", "FFFFFF", "AAA")
                .mapToInt(String::length)
                // [3,1,5,4,6,3]
                .sum());

        // Collectors
        System.out.println("Collectors : " + list.stream()
                .collect(Collectors.summingInt(String::length)));
    }
}
