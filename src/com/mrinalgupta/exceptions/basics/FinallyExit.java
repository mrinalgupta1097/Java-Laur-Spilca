package com.mrinalgupta.exceptions.basics;

public class FinallyExit {
    public static void main(String[] args) {
        try {
            System.exit(0);
        }finally {
            System.out.println(":)");// finally will not execute
        }
    }
}
