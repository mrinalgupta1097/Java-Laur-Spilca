package com.mrinalgupta.collections.Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTypes {
    public static void main(String[] args) {
        //basic array
        Integer[] i = new Integer[10];

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list1.add(10);
        list2.add(20);
    }
}
