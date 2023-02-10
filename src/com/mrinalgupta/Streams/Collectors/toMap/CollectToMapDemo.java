package com.mrinalgupta.Streams.Collectors.toMap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectToMapDemo {
    public static void main(String[] args) {
        List<String> list = List.of("AAA", "B", "CCCCC", "DDDD", "FFFFFF");
        Map<String,Integer> map = list.stream()
                .collect(Collectors.toMap(
                        k -> k,
                        String::length
                ));
    }
}
