package com.mrinalgupta.Streams.Operations.RemainingOperations;

import java.util.ArrayList;
import java.util.List;

public class SkipPeekDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //skip()
        System.out.println("count after skip : " + list.stream()
                .filter(n -> n % 2 == 0)
                .skip(2)
                .count());

        //peek() : do not use peek() to change values outside of input stream
        List<Integer> list2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list2.stream()
                .peek(System.out::println) // (1, 2, 3, 4, 5, 6, 7, 8, 9)
                .filter(n -> n % 2 == 0) //(2,4,6,8)
                .forEach(System.out::println);
    }
}
