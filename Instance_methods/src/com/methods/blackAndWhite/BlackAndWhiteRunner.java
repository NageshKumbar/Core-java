package com.methods.blackAndWhite;

public class BlackAndWhiteRunner {
    public static void main(String[] args) {
        BlackAndWhite blackAndWhite=new BlackAndWhite();
        Television television  =new Television(blackAndWhite);
        television.actors();
    }

}