package com.mrinalgupta.Streams.Operations.DictinctAndSorted;

import java.util.Comparator;
import java.util.List;

public class SortedWithComparator {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 5, 2, 7, 9, 8, 2, 1, 5, 4);
        //distinct() - count number of distinct elements
        list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
