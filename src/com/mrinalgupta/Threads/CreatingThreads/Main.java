package com.mrinalgupta.Threads.CreatingThreads;

public class Main {
    public static void main(String[] args) {
        EvenNumbersThread t1 = new EvenNumbersThread();
        /*
         * start() : is used to start the thread execution
         * as soon as the thread starts, JVM calls run() method of thread and performs the tasks
         */
        t1.start();
        System.out.println("End!" + Thread.currentThread().getName()); // returns the name of current thread
        /*
         * Possible Outputs
         * End! 0 2 4 6 8.... -> the most probable output because of (dt) delay time
         * 0 End! 2 4 6....
         * ......
         * 0 .... End!
         * threads though it may seem takes a little time to start
         *
         */
    }
}
