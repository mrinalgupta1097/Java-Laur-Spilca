package com.mrinalgupta.Threads.Synchronization.Volatile;

public class PrintingThread extends Thread {
    @Override
    public void run() {
        try {

            while (true) {
                System.out.println(Main.count);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
