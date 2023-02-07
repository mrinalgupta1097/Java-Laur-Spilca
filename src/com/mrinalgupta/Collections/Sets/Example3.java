package com.mrinalgupta.Collections.Sets;

import java.util.HashSet;
import java.util.Set;

public class Example3 {
    public static void main(String[] args) {
        // adding duplicates by add() does not throw exception
        Set<Integer> set1 = new HashSet<>(); // uses hashcode
        LinkedHashSet.addToSet(set1);
    }
}
