package com.mrinalgupta.Streams.Operations;

import java.util.Collection;
import java.util.List;

public class FlatMapsDemo {
    public static void main(String[] args) {
        List<List<Integer>> list = List.of(
                List.of(1, 2, 3, 4, 5),
                List.of(4, 5, 6),
                List.of(1, 3)
        );

        /*
        * flatMap()
        * flatMapToInt()
        * flatMapToDouble
        * flatMapToLong()
         */

        System.out.println(list.stream()
                .flatMap(Collection::stream)
                .mapToInt(s -> s)
                .sum());
    }
}
