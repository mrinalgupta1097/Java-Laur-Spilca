package com.mrinalgupta.Threads.ExecuterService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);
        Runnable r = () -> System.out.println(":)");
        Future<?> future = service.submit(r);
        try {
            future.get();
        }catch (InterruptedException | ExecutionException e){
            System.out.println(e.getMessage());
        }finally {
            service.shutdown();
        }
    }
}
