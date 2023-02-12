package com.mrinalgupta.Threads.Synchronization.WaitNotify;

public class Consumer extends Thread {
    public Consumer(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (Main.bucket) { //decide the monitor
                if (!Main.bucket.isEmpty()) {
                    int n = Main.bucket.get(0);
                    Main.bucket.remove(0);
                    Main.bucket.notifyAll();
                    System.out.println(Thread.currentThread().getName() +
                            " removed the value " + n + " from the bucket.");
                }
            }
        }
    }
}
