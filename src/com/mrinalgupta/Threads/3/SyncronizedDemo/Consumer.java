package com.mrinalgupta.Threads.SyncronizedDemo;

public class Consumer extends Thread {
    public Consumer(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (com.mrinalgupta.Threads.SyncronizedDemo.Main.bucket) { //decide the monitor
                if (!com.mrinalgupta.Threads.SyncronizedDemo.Main.bucket.isEmpty()) {
                    int n = com.mrinalgupta.Threads.SyncronizedDemo.Main.bucket.get(0);
                    com.mrinalgupta.Threads.SyncronizedDemo.Main.bucket.remove(0);
                    System.out.println(Thread.currentThread().getName() +
                            " removed the value " + n + " from the bucket.");
                }
            }
        }
    }
}
