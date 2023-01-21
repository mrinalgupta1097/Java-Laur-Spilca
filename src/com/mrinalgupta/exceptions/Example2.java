package com.mrinalgupta.exceptions;

import java.sql.SQLOutput;

public class Example2 {
    public static void main(String[] args) {
        try {
            System.exit(0);
        }finally {
            System.out.println(":)");// finally will not execute
        }
    }
}
