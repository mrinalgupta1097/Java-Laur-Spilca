package com.mrinalgupta.Threads.CreatingThreads;

public class EvenNumbersThread extends Thread {
    @Override
    public void run() { // main method of thread
        System.out.println("thread T1 starts : " + Thread.currentThread().getName());
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Interrupted Exception
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            /*
             * cannot throw exception with run as run() does not throw exception
             */
        }
        System.out.println("thread T1 ends");
    }
}
