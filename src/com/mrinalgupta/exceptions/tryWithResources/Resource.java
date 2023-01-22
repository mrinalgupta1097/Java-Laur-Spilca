package com.mrinalgupta.exceptions.tryWithResources;

public class Resource implements AutoCloseable{
    private String name;

    public Resource(String name) {
        this.name = name;
    }

    @Override
    public void close() {
        System.out.println(":)" + name);
    }
}
