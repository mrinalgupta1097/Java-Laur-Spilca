package com.mrinalgupta.exceptions.basics;

public class ReturnConflict {
    public static void main(String[] args) {
        int x = m();
        System.out.println(x);
        int y = finalReturn();
        System.out.println(y);
    }

    public static int m() {
        try {
            return 10;
        } finally {
            System.out.println(":)");
        }
    }

    public static int finalReturn() {
        try {
            return 50;
        } finally {
            return 20; // do not have return in finally as per clean code standards.
        }
    }

}
