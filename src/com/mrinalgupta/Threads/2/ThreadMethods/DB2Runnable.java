package com.mrinalgupta.Threads.ThreadMethods;

public class DB2Runnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("DB2 querying ended...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
