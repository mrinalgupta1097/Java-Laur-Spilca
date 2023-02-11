package com.mrinalgupta.Threads.ThreadMethods;

public class DB1Runnable implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("DB1 querying ended...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
