package com.mrinalgupta.Threads.Synchronization.Volatile;

public class IncrementingThread extends Thread{
    @Override
    public void run() {
        try {
            Main.count++;
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
