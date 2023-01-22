package com.mrinalgupta.exceptions.basics;

public class CatchBlockExample {
    public static void main(String[] args) {
        try {
            int x = m();
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println(":)");
        }
    }

    public static int m() {
        return 1 / 0;
    }
}
