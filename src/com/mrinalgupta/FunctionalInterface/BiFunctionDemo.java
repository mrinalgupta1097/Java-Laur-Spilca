package com.mrinalgupta.FunctionalInterface;

import java.util.HashMap;
import java.util.function.BiFunction;

public class BiFunctionDemo {
    /*
        BiFunction : takes two input and returns the output as per instructions given in lambda
            - abstract method : apply()
         */
    public static void main(String[] args) {
        BiFunction<Integer, String, HashMap<Integer,String>> createHashmap =
                (num, str) -> {
                    HashMap<Integer,String> map = new HashMap<>();
                    map.put(num,str);
                    return map;
                };
        HashMap<Integer,String> map1 = createHashmap.apply(1,"one");
        map1.forEach((k,v) -> System.out.println(v));
    }
}
