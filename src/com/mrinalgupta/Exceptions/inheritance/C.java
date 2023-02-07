package com.mrinalgupta.Exceptions.inheritance;

public class C implements I1{
    @Override
    public void m() {
        System.out.println("cannot throw more exception either none, less or equal");
    }

    public static void main(String[] args){
      //
        I1 c = new C();
        //c.m();// doesn't compile because checked exception has been thrown
//        c.m();
    }
}
