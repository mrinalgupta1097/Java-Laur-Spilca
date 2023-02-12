package com.mrinalgupta.Threads.SyncronizedDemo;

import java.util.Random;

public class Producer extends Thread {
    public Producer(String name) {
        super(name);
    }

    @Override
    public void run() {
        Random r = new Random();
        //100
        while (true) {
            synchronized (com.mrinalgupta.Threads.SyncronizedDemo.Main.bucket) {
                if (com.mrinalgupta.Threads.SyncronizedDemo.Main.bucket.size() < 100) {
                    int n = r.nextInt(1000);
                    com.mrinalgupta.Threads.SyncronizedDemo.Main.bucket.add(n);
                    System.out.println(Thread.currentThread().getName() + " added value " + n + " to the bucket ");
                }
            }
        }
    }
}
