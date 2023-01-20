package com.mrinalgupta.objectclass.examplegetclass;

import com.mrinalgupta.objectclass.ExampleToString.Cat;

import java.lang.reflect.Constructor;

public class Example2 {
    public static void main(String[] args) throws Exception {
      //
        Class c = Class.forName("com.mrinalgupta.objectclass.examplegetclass.Cat");
        Constructor<Cat> c2 =  c.getDeclaredConstructor();
//        obtaining instance from class
        Cat x = c2.newInstance();
//        obtaining class from instance
        Class q = x.getClass(); // any instance has this behavior
    }
}
