package com.mrinalgupta.Streams.Collectors;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectDemo {
    public static void main(String[] args) {
        List<String> list = List.of("AAA", "B", "CCCCC", "DDDD", "FFFFFF");
        // to List
        List<String> res1 = list.stream()
                .collect(Collectors.toList());

        // to set
        Set<String> res2 = list.stream()
                .collect(Collectors.toSet()); // returns Hashset ; unordered

        // to treeSet() : use toCollection in order to collect to specific collection
        TreeSet<String> res3 = list.stream()
                .collect(Collectors.toCollection(TreeSet::new));
    }
}
