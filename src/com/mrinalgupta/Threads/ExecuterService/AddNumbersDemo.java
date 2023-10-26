package com.mrinalgupta.Threads.ExecuterService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AddNumbersDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);

        AddNumbersCallable c = new AddNumbersCallable(3,5);

        Future<Integer> f = service.submit(c);
        try{
            var result = f.get();
            System.out.println(result);
        }catch (InterruptedException | ExecutionException e) {
            System.out.println(e.getMessage());
        } finally {
            service.shutdown();
        }
    }
}
