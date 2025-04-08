package com.methods.gold;

public class GoldMining {

    Gold gold;
    public GoldMining(Gold gold1) {
        this.gold=gold1;
        System.out.println("Parameterized contructor in gold mining");

    }

    public void mining() {
        System.out.println("Running mining in GoldMining");
        if(gold!=null){
            gold.carat();
        }
        else{
            System.out.println("Gold is null");
        }

    }

}