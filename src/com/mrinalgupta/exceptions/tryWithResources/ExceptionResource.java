package com.mrinalgupta.exceptions.tryWithResources;

public class ExceptionResource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new Exception("E");
    }
}
