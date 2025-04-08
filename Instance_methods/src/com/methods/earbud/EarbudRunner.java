package com.methods.earbud;

public class EarbudRunner {
    public static void main(String[] args) {
        Earbud earbud = new Earbud();
        Music music = new Music(earbud);
        music.listen();
    }
}
