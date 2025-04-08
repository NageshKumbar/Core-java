package com.methods.blackAndWhite;

public class Television {
    BlackAndWhite tV;


    public Television(BlackAndWhite tV){
        this.tV=tV;
        System.out.println("parameterized constructor initializing instance var");
    }



    public void actors(){
        System.out.println("running actors in television");
        if(tV!=null){
            tV.picture();
        }
        else {
            System.out.println("null exception");
        }
    }
}