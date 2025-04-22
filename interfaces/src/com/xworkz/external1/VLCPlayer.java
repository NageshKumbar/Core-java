package com.xworkz.external1;

import com.xworkz.internal.rules1.MediaPlayer;

public class VLCPlayer implements MediaPlayer {
    @Override
    public void play() {
        System.out.println("running play in vlc player");
    }

    @Override
    public void pause() {
        System.out.println("running pause in vlc player");

    }

    @Override
    public void stop() {
        System.out.println("running stop in vlc media player");
    }
}
