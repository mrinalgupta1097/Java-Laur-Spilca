package com.mrinalgupta.collections.Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        System.out.println("-------------Creating List--------------");
        System.out.println();
        List<Integer> list = new ArrayList<>();
        System.out.println("Size of ArrayList in beginning : " + list.size());
        list.add(10);
        list.add(20);
        list.add(33);
        list.add(1);
//        adding duplicates
        list.add(20);
        list.add(20);
        System.out.println("Size of ArrayList in end : " + list.size());
        System.out.println();
        System.out.println("-------------Fetching Elements From List--------------");
        System.out.println();
        Integer x = list.get(3);//1
        System.out.println("elements at index 3 : " + x);
        Integer y = list.get(5);//1
        System.out.println("elements at index 3 : " + y);
        System.out.println();
//        System.out.println("-------------IndexOutOfBoundsException--------------");
//        System.out.println();
//        Integer z = list.get(6);//1
//        System.out.println("elements at index 3 : " + y);
        System.out.println("-------------Parse Array--------------");
        for (int i = 0; i < list.size(); i++) {
            Integer x1 = list.get(i);
            System.out.println(x1);
        }
        System.out.println();
        System.out.println("-------------Parse Array Using For-Each--------------");
        for (int i :
                list) {
            System.out.println(i);

        }
        System.out.println();
        System.out.println("-------------Parse Array Using Iterator--------------");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer xi = it.next();
            System.out.println(xi);
        }
        System.out.println();
        System.out.println("-------------Parse using Java 8--------------");
        list.forEach(System.out::println);
        System.out.println();
        System.out.println("-------------Remove Elements--------------");
//        list.remove(10);//IndexOutOfException
        list.remove(4);
        System.out.println(list);
        list.remove((Integer) 20);
        System.out.println(list);
    }
}
