package com.mrinalgupta.Streams.Collectors.JoiningTeeing;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TeeingExample {
    public static void main(String[] args) {
        List<String> list = List.of("AAA", "B", "CCCCC", "DDDD", "FFFFFF", "AAA");
         // teeing takes 2 collectors and 1 BiFUnction as paramters
        // combines the result of 2 collectors
        var res = list.stream()
                .collect(Collectors.teeing(
                        Collectors.counting(),
                        Collectors.joining(),
                        (a,b) -> Map.of(b,a)
                ));
        System.out.println(res);
    }
}
