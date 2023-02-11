package com.mrinalgupta.Threads.ThreadMethods;

public class JoinDemo {
    public static void main(String[] args) {
        //1
        // query DB1 -> 3 seconds
        // query DB2 -> 2 seconds
        // max(3,2) = 3 < 5 seconds


        //2 -> join()
        // processing
        var db1 = new DB1Runnable();
        var db2 = new DB2Runnable();

        Thread t1 = new Thread(db1);
        Thread t2 = new Thread(db2);

        t1.start();
        t2.start();

        /*
         * setPriority() : it is an advice given to JVM for controlling thread execution
         */
        /*
         * join() : wait for the current thread execution to end
         *       before next instruction can be executed
         */
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*
         * processing starts before Db query ended,
         * and we don't want this in real world scenarios
         * solution is to use join()
         */
        System.out.println("Processing...");
    }
}
