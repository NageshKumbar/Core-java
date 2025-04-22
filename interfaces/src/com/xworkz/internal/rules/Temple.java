package com.xworkz.internal.rules;

public interface Temple {
    void pooja();
    static void noPicture(){
        System.out.println("No picture should be taken inside an Temple");
    }
}