package com.mrinalgupta.Streams.Operations.MapsAndFlatMaps;

import java.util.List;

public class MoreMapOperations {
    public static void main(String[] args) {
        List<String> list = List.of("abcd", "qwerty", "asdfg");

        /*  * ---------------- IntStream -------------------
         * map(Function) : Stream -> Stream
         * mapToInt(ToIntFunction) : Stream -> IntStream
         * mapToLong(ToLongFunction) : Stream -> LongStream
         * mapToDouble(ToDoubleFunction) : Stream -> DoubleStream
         */

        /*  * ---------------- IntStream -------------------
         * map(ToIntFunction) : IntStream -> IntStream
         * mapToLong(IntToLongFunction) : IntStream -> LongStream
         * mapToDouble(IntToDoubleFunction) : IntStream -> DoubleStream
         * mapToObj(IntFunction) : IntStream -> Stream

         * there are other steams like LongStream & DoubleStream

         */

        var x = list.stream()
                .mapToInt(String::length)
                .mapToObj(s -> s)
                .reduce(0, Integer::sum);
        System.out.println(x);
    }
}
