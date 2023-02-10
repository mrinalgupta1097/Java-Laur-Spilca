package com.mrinalgupta.Streams.Collectors.Downstreaming;

import java.util.List;
import java.util.stream.Collectors;

public class MappingDemo {
    public static void main(String[] args) {
        List<String> list = List.of("AAA", "B", "CCCCC", "DDDD", "FFFFFF", "AAA");

        var result = list.stream().collect(Collectors.mapping(str -> str.length(), // string -> list
                Collectors.toList())); // downstreaming

        System.out.println(result);

        // above example is similar to .stream().map(s -> s.length()).collect(Collectors.toList())
    }
}
