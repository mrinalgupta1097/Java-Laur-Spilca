package com.mrinalgupta.Streams.Operations.DictinctAndSorted;

import java.util.List;

public class DistinctAndSorted {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 5, 2, 7, 9, 8, 2, 1, 5, 4);
        //distinct() - count number of distinct elements
        System.out.println(list.stream()
                .distinct()
                .count());

        //sorted()
        list.stream()
                .distinct() //using sorted before distinct will cause the sorting of more elements than needed
                .sorted()
                .forEach(System.out::println);

    }
}
