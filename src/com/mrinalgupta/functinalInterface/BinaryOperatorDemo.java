package com.mrinalgupta.functinalInterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo{   /*
        BinaryOperator : BiFunction whose input and return types are same
            - abstract method : apply()
    */
    public static void main(String[] args) {
        BinaryOperator<Integer> sum = (x,y) -> x+y;
        int s = sum.apply(3,2);
        System.out.println(s);
    }
}
