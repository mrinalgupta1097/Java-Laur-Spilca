package com.mrinalgupta.exceptions.tryWithResources;

public class ResourceWithException {
    public static void main(String[] args) {
        try(ExceptionResource er = new ExceptionResource()) {
            throw new Exception("Ex");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Throwable[] t = e.getSuppressed();
            for (Throwable x :
                    t) {
                System.out.println(x);
            }
        }
    }
}
