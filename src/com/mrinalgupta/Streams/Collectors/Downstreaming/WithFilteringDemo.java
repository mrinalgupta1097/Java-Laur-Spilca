package com.mrinalgupta.Streams.Collectors.Downstreaming;

import java.util.List;
import java.util.stream.Collectors;

public class WithFilteringDemo {
    public static void main(String[] args) {
        List<String> list = List.of("AAA", "B", "CCCCC", "DDDD", "FFFFFF", "AAA");

        //filtering strings with even length
        /*
        * filtering() takes two arguments
        * 1. predicate for filter
        * 2. collector for downstream the filtered collection
        * Here we filter the input list for strings having even length,
        *  and then we collect the length in a list
         */
        var result = list.stream()
                .collect(Collectors.mapping(String::length,
                        Collectors.filtering(len -> len % 2 == 0, Collectors.toList())
                ));
        System.out.println(result);

        /*
        * above code is similar to
        * stream()
        *       .map(String::length)
        *       .collect(Collectors
        *                   .filtering(len -> len % 2 == 0,
        *                    Collectors.toList())
         */

    }
}
