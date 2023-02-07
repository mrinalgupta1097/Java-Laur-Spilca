package com.mrinalgupta.Streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamCreationDemo {
    public static void main(String[] args) {
        // create empty stream from finite source
        Stream<Integer> s1 = Stream.empty(); // creates empty stream

        // create stream from elements from finite source
        Stream<Integer> s2 = Stream.of(1,3,5,6);
//        s2.forEach(System.out::println);

        //create stream from supplier from infinite source
        Supplier<Integer> sup = () -> new Random().nextInt();
        Stream<Integer> s3 = Stream.generate(sup);
//        s3.forEach(System.out::println);

        // limit data from infinite source
//        s3.limit(10) // limits the values as per the limit given as parameter
//                .forEach(System.out::println);

        // create stream from unary
        Stream<Integer> s4 = Stream.iterate(1,i -> i +2);
        s4.limit(3).forEach(System.out::println);

        // another implementation of iterate() from Java 9
        Stream<Integer> s5 = Stream.iterate(1, i -> i <= 10, i -> i+1);  //finite
        s5.forEach(System.out::println);

    }
}
