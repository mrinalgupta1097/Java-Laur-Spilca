package com.mrinalgupta.ObjectClass.examplegetclass;

import com.mrinalgupta.ObjectClass.ExampleToString.Cat;

import java.lang.reflect.Constructor;

public class Example2 {
    public static void main(String[] args) throws Exception {
      //
        Class c = Class.forName("com.mrinalgupta.ObjectClass.examplegetclass.Cat");
        Constructor<Cat> c2 =  c.getDeclaredConstructor();
//        obtaining instance from class
        Cat x = c2.newInstance();
//        obtaining class from instance
        Class q = x.getClass(); // any instance has this behavior
    }
}
