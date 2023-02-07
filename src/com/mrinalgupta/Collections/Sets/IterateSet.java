package com.mrinalgupta.Collections.Sets;

import java.util.Set;

public class IterateSet {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(10, 1000, 23, 300, 256);

        for (Integer x : set1) {
            System.out.println(x);
        }
    }
}