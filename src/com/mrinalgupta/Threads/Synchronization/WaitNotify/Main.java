package com.mrinalgupta.Threads.Synchronization.WaitNotify;


import com.mrinalgupta.Threads.Synchronization.SyncronizedDemo.Producer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> bucket = new ArrayList<>();
    public static void main(String[] args) {
        com.mrinalgupta.Threads.Synchronization.SyncronizedDemo.Producer p1 = new com.mrinalgupta.Threads.Synchronization.SyncronizedDemo.Producer("p1");
        com.mrinalgupta.Threads.Synchronization.SyncronizedDemo.Producer p2 = new Producer("p2");
        Consumer c1 = new Consumer("c1");
        Consumer c2 = new Consumer("C2");

        p1.start();
        p2.start();
        c1.start();
        c2.start();


    }
}
