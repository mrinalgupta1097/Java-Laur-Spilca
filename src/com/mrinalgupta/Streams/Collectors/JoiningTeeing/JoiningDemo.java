package com.mrinalgupta.Streams.Collectors.JoiningTeeing;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningDemo {
    public static void main(String[] args) {
        List<String> list = List.of("AAA", "B", "CCCCC", "DDDD", "FFFFFF", "AAA");

        // joining without delimiter
        String result = list.stream()
                .collect(Collectors.joining());
        System.out.println(result);

        // joining with delimiter
        String result2 = list.stream()
                .collect(Collectors.joining(" "));
        System.out.println(result2);

        // joining with prefixes and suffixes - Java 9
        String result3 = list.stream()
                .collect(Collectors.joining(" ", "{", "}"));
        System.out.println(result3);

    }
}
