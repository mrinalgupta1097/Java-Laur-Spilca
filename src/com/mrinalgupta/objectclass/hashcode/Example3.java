package com.mrinalgupta.objectclass.hashcode;

public class Example3 {
    public static void main(String[] args){
      //
        Card c1 = new Card("12345"); // address in memory : z1
        Card c2 = new Card("12345"); // address in memory : z2

        System.out.println(c1 == c2); //false
        System.out.println(c1.equals(c2)); // true
    }
}
