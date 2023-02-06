package com.mrinalgupta.functinalInterface;

public class FunctionalInterfaceImpl {
    public static void main(String[] args) {

        // anonymous function
        Eatable e1 = new Eatable() {
            @Override
            public void eat() {
                System.out.println("hap,hap");
            }
        };
        Eatable e2 = () -> System.out.println("hap,hap");
    }
}
