package com.mrinalgupta.FunctionalInterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        /*
           Supplier :
            - functional interface which returns the value
            - abstract method is get()
         */
        Supplier<Integer> s1 = () -> 10;
        Integer x = s1.get();
        System.out.println(x);

        // supplier to return random integer between bounded context
        Random r = new Random();
        Supplier<Integer> s2 = ()-> r.nextInt(1000);
        Integer y = s2.get();
        System.out.println(y);
    }
}
