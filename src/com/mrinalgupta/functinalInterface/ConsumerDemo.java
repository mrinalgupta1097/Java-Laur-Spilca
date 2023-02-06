package com.mrinalgupta.functinalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        /*
        Consumer : only consumes returns nothing
            - abstract method : accept()
         */
        System.out.println("-------Consumer Example-------");
        Consumer<String> c1 = s -> System.out.println(s);
        c1.accept("Hello");

        /*
        BiConsumer : a consumer which consumes 2 values and returns nothing
            - abstract method : accept()
         */
        System.out.println("-------BiConsumer Example-------");
        BiConsumer<String, Integer> c2 = (a, b) -> System.out.println(a + " " + b);
        c2.accept("mrinal", 1);
    }
}
