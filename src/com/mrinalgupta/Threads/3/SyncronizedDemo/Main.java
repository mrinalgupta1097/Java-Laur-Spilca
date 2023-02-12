package com.mrinalgupta.Threads.SyncronizedDemo;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> bucket = new ArrayList<>();
    public static void main(String[] args) {
        com.mrinalgupta.Threads.SyncronizedDemo.Producer p1 = new com.mrinalgupta.Threads.SyncronizedDemo.Producer("p1");
        com.mrinalgupta.Threads.SyncronizedDemo.Producer p2 = new com.mrinalgupta.Threads.SyncronizedDemo.Producer("p2");
        com.mrinalgupta.Threads.SyncronizedDemo.Consumer c1 = new com.mrinalgupta.Threads.SyncronizedDemo.Consumer("c1");
        com.mrinalgupta.Threads.SyncronizedDemo.Consumer c2 = new com.mrinalgupta.Threads.SyncronizedDemo.Consumer("C2");

        p1.start();
        p2.start();
        c1.start();
        c2.start();


    }
}
