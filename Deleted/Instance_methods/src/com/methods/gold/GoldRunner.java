package com.methods.gold;

public class GoldRunner {
    public static void main(String[] args) {
        Gold gold = new Gold();
        GoldMining goldMining = new GoldMining(gold);
        goldMining.mining();
    }
}
//String abc=null;