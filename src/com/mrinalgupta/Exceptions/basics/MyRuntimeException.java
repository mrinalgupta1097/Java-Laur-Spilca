package com.mrinalgupta.Exceptions.basics;

public class MyRuntimeException extends RuntimeException{
    public MyRuntimeException(){
        super("This is my runtime exception.");
    }

    public static void main(String[] args){
      throw new MyRuntimeException();
    }
}
