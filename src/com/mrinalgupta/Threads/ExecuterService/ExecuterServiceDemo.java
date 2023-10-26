package com.mrinalgupta.Threads.ExecuterService;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServiceDemo {
    public static void main(String[] args) {
        //Executor <- ExecuterService
        int nThreads = Runtime.getRuntime().availableProcessors(); // returns no of processors available to JVM
        ExecutorService executerService = Executors.newFixedThreadPool(nThreads);
        try {
            System.out.println(nThreads);
            executerService.execute(() -> System.out.println(":)" + Thread.currentThread().getName()));
            executerService.execute(() -> System.out.println(":(" + Thread.currentThread().getName()));
        } finally {
            //shutting down the executer service (mandatory else Garbage collection won't happen)
            //write it in finally block in good practice
            if (executerService != null) executerService.shutdown();
            /*
            * shutdown() method puts the pool in shutdown state it will wait for current tasks to complete,
            * but it will not accept any new tasks, returns void
            * ont the other hand shutDownNow() method returns a list of unfinished tasks from thr pool and
            * sweep the pool
             */
        }


    }
}

