package com.mrinalgupta.Streams.Operations;

import java.util.Arrays;
import java.util.List;

public class FIndTotalCharactersInListOfStrings {
    public static void main(String[] args) {
        List<String> list = List.of("ksfkj562jfkjf","sdhsjh443fshfhfshfshf", "shfjshfjshf");

        String digits = "0123456789";
        System.out.println(list.stream()
                .flatMap(s -> Arrays.stream(s.split(""))) // "k","s".....
                .filter(digits::contains) // "5", "6", "2"......
                .count());
    }
}
