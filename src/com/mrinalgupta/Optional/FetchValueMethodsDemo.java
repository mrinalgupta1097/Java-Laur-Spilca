package com.mrinalgupta.Optional;

import java.util.Optional;
import java.util.function.Supplier;

public class FetchValueMethodsDemo {
    public static void main(String[] args) {

        Optional<Integer> o1 = Optional.empty();
        Optional<Integer> o2 = Optional.of(10);

        /*
         * get() method returns the value present in the optional
         * NoSuchElementException if no value is present
         *  it is better to check the value present with isPresent()
         */

        if (o2.isPresent()) {
            System.out.println(o2.get());
        }

        /*
         * orElse() returns the value if present
         * else returns th integer provided as argument
         */

        System.out.println("orElse(): " + o1.orElse(-1));
        System.out.println("orElse(): " + o2.orElse(-1));

        /*
         * orElseGet() : asks for a supplier and returns the output of supplier
         * if the value is not present
         */

        Supplier<Integer> supplier = () -> -1;
        System.out.println("orElseGet(): " + o1.orElseGet(supplier));
        System.out.println("orElseGet(): " + o2.orElseGet(supplier));

        /*
         * orElseThrow() : take an exception supplier
         */
        System.out.println("orElseThrow(): " + o2.orElseThrow(() -> new RuntimeException("Exception : custom")));

        /*
        * or() returns value if present
        * if absent returns another optional supplier
         */
        System.out.println(o1.or(() -> o2).orElse(-1));
        /*
        * ifPresentOrElse() : f a value is present,
        *  performs the given action with the value,
        *  otherwise performs the given empty-based action.
         */
        o1.ifPresentOrElse(System.out::println, () -> {
            System.out.println("No Value :(");
        });

        /*
        * map() same operation as any other map
         */
        var res1 = o2.map(x -> x*2).orElse(-1);
        System.out.println(res1);
    }
}
