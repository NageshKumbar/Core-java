package com.xworkz.god.internal;

public class Comb {
    public Comb(){
        System.out.println("No arg const");
    }
    public void hairs(){
        System.out.println("public method of comb");
    }
    void oil(){
        System.out.println("package-default method of comb");
        shampoo();
    }
    private void shampoo(){
        System.out.println("private method of comb");
    }
}
