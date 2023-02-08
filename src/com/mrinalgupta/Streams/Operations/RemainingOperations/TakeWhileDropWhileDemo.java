package com.mrinalgupta.Streams.Operations.RemainingOperations;

import java.util.List;

public class TakeWhileDropWhileDemo {
    public static void main(String[] args) {

        //takeWhile()
        List<Integer> list = List.of(1,2,3,50,70,100,130);
        System.out.println(list.stream()
                .takeWhile(n -> n <= 100)
                .count());
        // dropWhile()
        System.out.println(list.stream()
                .dropWhile(n -> n <= 100)
                .count());
    }
}
