package com.mrinalgupta.exceptions.tryWithResources;

public class MultipleResources {
    public static void main(String[] args) {
        try(Resource r1 = new Resource("r1");
            Resource r2 = new Resource("r2")){// separate multiple resources by semicolon
            System.out.println("do");
            /*
            * resources close in LIFO order,so
            * r2 resource will be closed first then r1
             */
        }
    }
}
