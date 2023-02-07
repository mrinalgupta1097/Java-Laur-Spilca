package com.mrinalgupta.Exceptions.inheritance;

public class Main {
    public static void main(String[] args) {
        try {
            int x =m();
            System.out.println(x);
        }finally{
            System.out.println(" :) ");
        }

//        m();
    }
    public static int m(){
        int x = 1/0;//ArithmeticException : runtime exception so the program will compile
        return x;
    }
}
