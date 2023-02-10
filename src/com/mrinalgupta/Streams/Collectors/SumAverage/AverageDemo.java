package com.mrinalgupta.Streams.Collectors.SumAverage;

import java.util.List;
import java.util.stream.Collectors;

public class AverageDemo {
    /*
    * Calculate the average of int stream
    * averagingInt()
    * averagingLong()
    * averagingDouble()
     */
    public static void main(String[] args) {
        List<String> list = List.of("AAA", "B", "CCCCC", "DDDD", "FFFFFF", "AAA");

        System.out.println(list.stream()
                .collect(Collectors.averagingDouble(String::length)));

    }
}
