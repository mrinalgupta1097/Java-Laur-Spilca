package com.mrinalgupta.Threads.ExecuterService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmitDemo {
    public static void main(String[] args) {
        //Executor <- ExecuterService
        int nThreads = Runtime.getRuntime().availableProcessors(); // returns no of processors available to JVM
        ExecutorService executerService = Executors.newFixedThreadPool(nThreads);
        try {
            /*
            * execute return type is void
            * while submit() returns a future of generic type
             */
            System.out.println(nThreads);
            Future<?> future = executerService.submit(() -> System.out.println("hello"));
        } finally {
            if (executerService != null) executerService.shutdown();

        }


    }
}

