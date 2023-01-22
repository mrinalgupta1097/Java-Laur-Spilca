package com.mrinalgupta.exceptions.basics;

public class example1 {
    /*
     Throwable
        Exception : can be handled
            RuntimeException
        Error : cannot be handled
            e.g. OutOfMemoryError, StackOverFlowError
            *
     -> checked exceptions
     -> unchecked exceptions (runtime) -> RuntimeException
            can get to runtime as they are not checked by compiler

     */
    public static void main(String[] args){
        RuntimeException e = new RuntimeException();
        // throw e; will not compile if e is object of Exception as Exception contains both checked and unchecked exceptions
        // and we cant throw unchecked exceptions
        throw e;
    }
}
