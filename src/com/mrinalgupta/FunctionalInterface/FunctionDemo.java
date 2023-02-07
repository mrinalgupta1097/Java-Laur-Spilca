package com.mrinalgupta.FunctionalInterface;

import java.util.function.Function;

public class FunctionDemo {
    /*
        Function :  consumes and returns,
            - abstract method : apply()
         */
    public static void main(String[] args) {
        Function<String, Integer> f1 = s -> s.length();
        Integer length = f1.apply("hello");
        System.out.println(length);
    }
}
