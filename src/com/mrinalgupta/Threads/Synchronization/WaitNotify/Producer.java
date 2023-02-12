package com.mrinalgupta.Threads.Synchronization.WaitNotify;

import com.mrinalgupta.Threads.Synchronization.SyncronizedDemo.Main;

import java.util.Random;

public class Producer extends Thread {
    public Producer(String name) {
        super(name);
    }

    /*
    * there might be a scenario where the bucket size is either 0 or full
    * if one thread has already acquired the lock then it will continue to check the if condition
    * and will nor end.
     */
    /*
    * wait() & notify() should always be called only inside synchronized block,
    * and they should be called on monitor
    * wait() & notify() are part of Object class because we can use any object as monitors
     */

    @Override
    public void run() {
        try {


            Random r = new Random();
            //100
            while (true) {
                synchronized (Main.bucket) {
                    if (Main.bucket.size() < 100) {
                        int n = r.nextInt(1000);
                        Main.bucket.add(n);
                        System.out.println(Thread.currentThread().getName() + " added value " + n + " to the bucket ");
                    } else {
                        Main.bucket.wait(); // producer waits now
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
