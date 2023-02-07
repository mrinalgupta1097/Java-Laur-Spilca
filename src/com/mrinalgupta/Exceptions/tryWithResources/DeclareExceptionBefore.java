package com.mrinalgupta.Exceptions.tryWithResources;

public class DeclareExceptionBefore {

    public static void main(String[] args) {
        Resource r1 = new Resource("A");
        Resource r2 = new Resource("B");
        try(r1;r2){

        }
        r1.close();
    }

}
