package com.mrinalgupta.Threads.ExecuterService;

import java.util.concurrent.Callable;

public class AddNumbersCallable implements Callable<Integer> {
    private int x;
    private int y;

    public AddNumbersCallable(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Integer call() {
        return x + y;
    }
}

