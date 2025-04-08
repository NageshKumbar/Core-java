package com.methods.earbud;

public class Music {

    Earbud earbud;
    public Music(Earbud earbud) {
        this.earbud = earbud;
        System.out.println("parameteried const in music");
    }

    public void listen() {
        System.out.println("running listen in music");
        if (earbud != null) {
            earbud.frequency();
        }
        else {
            System.out.println("earbud is null");
        }
    }
}
