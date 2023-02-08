package com.mrinalgupta.Streams.Basics;

import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
//        Imperative Style
        List<Integer> list = List.of(1,5,6,7,8,9);
        /* for (Integer i : list){
             if(i % 2 == 0){
                 System.out.println(i);
            }
        }
        */

        // functional programming style
        list.stream()
                .filter(x -> x%2 ==0)  // takes predicate
                .forEach(System.out::println); // takes consumer
    }
}
