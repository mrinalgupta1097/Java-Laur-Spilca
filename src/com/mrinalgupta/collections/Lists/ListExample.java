package com.mrinalgupta.collections.Lists;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        // creating lists
        List<String> list1 =  Arrays.asList("ABC", "QWE", "AAA");
        List<String> list2 =  List.of("ABC", "QWE", "AAA");
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new LinkedList<>();
        Collection<String> c1 = Arrays.asList("ABC", "QWE", "AAA");
        System.out.println(list1);

        /*
        * Do not do this :
        * ArrayList<String> list1 =  Arrays.asList("ABC", "QWE", "AAA");
        * Because asList returns based on Generic Type which is List.
        * Always use interface not implementation
        */
    }
}
