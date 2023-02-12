package com.mrinalgupta.Threads.CreatingThreads;

public class RunnableThread {
    public static void main(String[] args) {
        var r1 = new com.mrinalgupta.Threads.CreatingThreads.OddNumbersRunnable();

        Thread t1 = new Thread(r1, "T1"); //NEW state
        Thread t2 = new Thread(r1, "T2");
        t1.start(); // NEW -> RUNNABLE
        t2.start();
        System.out.println("End " + Thread.currentThread().getName());
    }
}
