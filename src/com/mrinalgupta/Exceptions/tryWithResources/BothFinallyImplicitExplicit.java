package com.mrinalgupta.Exceptions.tryWithResources;

public class BothFinallyImplicitExplicit {
    public static void main(String[] args) {
//        close will be called first then finally will be called
        try(Resource r = new Resource("r")) {

        }finally {
            System.out.println(":(");
        }
    }
}
