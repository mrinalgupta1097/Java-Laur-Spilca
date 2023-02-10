package com.mrinalgupta.Streams.Collectors.toMap;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CollectToMapDuplicatesDemo {

    public static void main(String[] args) {
        List<String> list = List.of("AAA", "B", "CCCCC", "DDDD", "FFFFFF", "AAA");
        Map<String, Integer> map = list.stream()
                .collect(Collectors.toMap(
                        k -> k,
                        String::length, //value
                        Integer::sum, // add "key length" for duplicates key
                        TreeMap::new // specific
                        ));
    }
}

