package com.mrinalgupta.Streams.Collectors.Downstreaming;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByDemo {
    public static void main(String[] args) {
        List<String> list = List.of("AAA", "B", "CCCCC", "DDDD", "FFFFFF", "AAA");

        /*
         * groupingBy() groups the input streams based on the classifier
         */
        var result = list.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(result);

        Map<Integer, String> map =
                list.stream()
                        .collect(
                                Collectors.groupingBy(
                                        String::length,
                                        Collectors.mapping(
                                                String::valueOf,
                                                Collectors.joining())));
        System.out.println(map);
    }
}
