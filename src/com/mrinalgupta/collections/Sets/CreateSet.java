package com.mrinalgupta.collections.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CreateSet {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(10,20,30);
        Set<Integer> set2 = new HashSet<>(); // no order
        Set<Integer> set3 = new LinkedHashSet<>(); // insertion order
        Set<Integer> set4 = new TreeSet<>(); // sorted

    }
}
