package com.xworkz.internal;

public class MaxRouter extends Router {
    public MaxRouter(){
        System.out.println("Running MaxRouter const");
    }
    @Override
    public void userouter(){
        System.out.println("Running userouter method in subclaass");
    }
    public void mainrouter(){
        System.out.println("Running mainrouter method in the subclass");
    }
}
