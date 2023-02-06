package com.mrinalgupta.functinalInterface;

import java.util.function.Predicate;

public class PredicateExample {
    /*
        Predicate : takes input and returns boolean
            - abstract method : test()
    */
    public static void main(String[] args) {
        Predicate<Integer> checkEven = num -> num%2 == 0;
        Boolean isEven = checkEven.test(4);
        Boolean isEven2 = checkEven.test(5);
        System.out.println(isEven);
    }
}
