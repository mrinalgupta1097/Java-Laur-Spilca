package com.mrinalgupta.Streams.Collectors.Downstreaming;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParititonByDemo {
    public static void main(String[] args) {
        List<String> list = List.of("AAA", "B", "CCCCC", "DDDD", "FFFFFF", "AAA");

        /*
        * partitioningBy() : divides the inout stream into 2 part based on predicate given
        * returns a map of 2 partitions
        * Map<Boolean, List<T>> T is the type of input streams
         */
        Map<Boolean, List<String>> result = list.stream()
                .collect(
                        Collectors.partitioningBy(s-> s.length() %2 == 0));
        System.out.println(result);

        Map<Boolean,Long> result2 = list.stream()
                        .collect(Collectors.partitioningBy(s -> s.length() % 2 == 0, Collectors.counting()));
        System.out.println(result2);


    }
}
