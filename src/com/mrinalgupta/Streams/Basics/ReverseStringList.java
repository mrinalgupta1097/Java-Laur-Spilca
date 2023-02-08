package com.mrinalgupta.Streams.Basics;

import java.util.List;
import java.util.stream.Collectors;

public class ReverseStringList {

    public static void main(String[] args) {
        List<String> stringList = List.of("aman", "random", "delhi");
        List<String> reversedStrings = reverseStringsInList(stringList);
        reversedStrings.forEach(System.out::println);
    }
    public static List<String> reverseStringsInList(List<String> list){
        return list.stream()
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.toList());
    }
}
