package com.xworkz.god.internal;

public class Church {

    public Church(){
        System.out.println("No arg const");
    }
    public void candle(){
        System.out.println("public method of church");
    }
    void prayer(){
        System.out.println("package-default method of church");
        wine();
    }
    private void wine(){
        System.out.println("private method of church");
    }


}
