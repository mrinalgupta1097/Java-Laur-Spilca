package com.mrinalgupta.Streams.Collectors.SumAverage;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummarizingDemo {
    /*
     * in some cases both sum and average are required
     * one way is to just write the code again
     * here is how
     */
    public static void main(String[] args) {
        List<String> list = List.of("AAA", "B", "CCCCC", "DDDD", "FFFFFF", "AAA");

        long count = list.stream().mapToInt(String::length).count();

        long sum = list.stream().mapToInt(String::length).sum();

        var average = list.stream().mapToInt(String::length).average();

        /*
         * or we can use summaryStatistics()
         */
        IntSummaryStatistics summary = list.stream()
                .mapToInt(String::length)
                .summaryStatistics();
        /*
        * there are different values that can be fetched from Streams
        */
        System.out.println(summary);

        /*
        * the above information can be performed by Collectors as well
         */

        System.out.println(list.stream().collect(
                Collectors.summarizingInt(String::length)
        )); //IntSummaryStatistics{count=6, sum=22, min=1, average=3.666667, max=6}

    }
}
