package com.mrinalgupta.Threads.ExecuterService;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);
        Callable<String> c = () -> "Hello";
        Future<String> f = service.submit(c);
        try {
            String result = f.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e.getMessage());
        } finally {
            service.shutdown();
        }
    }
}
