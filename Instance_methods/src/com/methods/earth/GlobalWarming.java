package com.methods.earth;

public class GlobalWarming {
    Earth globe;
    public GlobalWarming(Earth globe1){
        this.globe=globe1;
        System.out.println("Running global warming local var is assigned to global");
    }
    public void leaf(){

        System.out.println("running leaf in global");
        if(globe!=null){
            globe.Tree();
        }
        else {
            System.out.println("null pointer");
        }
    }
}