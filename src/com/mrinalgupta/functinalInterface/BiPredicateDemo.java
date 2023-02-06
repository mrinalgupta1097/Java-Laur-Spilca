package com.mrinalgupta.functinalInterface;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
        /*
        BiPredicate : takes two input and returns boolean
            - abstract method : test()
    */
        public static void main(String[] args) {
            BiPredicate<String,String> checkEqualStrings = (str1,str2) -> str1.equals(str2);
            Boolean areEqualStrings = checkEqualStrings.test("one", "one");
            Boolean areEqualStrings2 = checkEqualStrings.test("dsjdj", "sjdjs");
            System.out.println(areEqualStrings);
            System.out.println(areEqualStrings2);
        }
}
