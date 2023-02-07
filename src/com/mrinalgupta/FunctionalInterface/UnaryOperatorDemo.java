package com.mrinalgupta.FunctionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
        /*
        UnaryOperator  : function whose input and return have same types
            - abstract method : apply()
    */
        public static void main(String[] args) {
            UnaryOperator<Integer> u1 = x -> x+1;
            int res = u1.apply(10);
            System.out.println(res);
        }
}
