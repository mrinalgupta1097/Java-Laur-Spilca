package com.mrinalgupta.Streams.Operations.MapsAndFlatMaps;

import java.util.List;

public class MapReduceDemo {
    public static void main(String[] args) {
        List<String> list = List.of("abcd", "qwerty", "asdfg");

        var x = list.stream()
                // takes function : takes input return o/p; transforms
                .map(String::length)
                // sum method can not be used because the Stream<Integer> is still more abstract stream
                .reduce(0,(a,b)-> a+b);
        System.out.println(x);

        //example2
        reverseListOfStrings(list);
    }

    public static void reverseListOfStrings(List<String> strList){
         strList.stream()
                .map(str -> new StringBuilder(str).reverse().toString())
                .forEach(System.out::println);
    }
}
