package com.mrinalgupta.Optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        /*
        * Java 8
        *The idea of "Optional" is to eliminate the need for null checks
        *And provide a way to express the absence of a value
        *In a more explicit and readable way
         */

//        String s = null;
//        int length = s.length(); // :( NPE
        // creating Optional
        Optional<Integer> o1 = Optional.empty();
        Optional<Integer> o2 = Optional.of(10);

//        Optional<Integer> o2 = Optional.of(null); // throws exception
//        Optional<Integer> o3 = Optional.of(m()); // throws exception
        /*
        * returns Optional of value
        * returns empty optional if no value is present
         */
        Optional<Integer> o4 = Optional.ofNullable(10);
        Optional<Integer> o5 = Optional.ofNullable(m1());

        /*
        * isPresent() can be used to check if the value is present
        * returns boolean
        * true -> present
        * false -> value absent
         */
        boolean b1 = o1.isPresent(); // false
        boolean b2 = o2.isPresent(); // true
    }
    static Integer m1(){
        return null;
    }
}
