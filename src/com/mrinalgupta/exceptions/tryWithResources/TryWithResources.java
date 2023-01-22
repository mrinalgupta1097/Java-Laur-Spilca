package com.mrinalgupta.exceptions.tryWithResources;

public class TryWithResources {
    public static void main(String[] args) {
//        Resource r = null;
//        try {
//            r = new Resource();
//        } catch (Exception e) {
//            //
//        } finally {
//            try {
//                if (r == null) {
//                    r.close();
//                }
//            }catch(Exception e){
//
//            }
//
//        }
        // structure becoming very complex even with single resource. Imagine with multiple resource.
        try(Resource r = new Resource("r")) {

        }catch (Exception e){

        }
    }

}
