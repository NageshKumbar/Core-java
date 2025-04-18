package com.xworkz.internal;

import java.util.Objects;

public class Fan {
    String type;
    int speedSettings;
    boolean remoteControl;
    boolean oscillating;

    public Fan(String type, int speedSettings, boolean remoteControl, boolean oscillating) {
        this.type = type;
        this.speedSettings = speedSettings;
        this.remoteControl = remoteControl;
        this.oscillating = oscillating;
    }

    @Override
    public String toString() {
        return "Type = " + type + ", Speed Settings = " + speedSettings + ", Remote Control = " + remoteControl + ", Oscillating = " + oscillating;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Fan) {
            Fan fan = (Fan) obj;
            if (Objects.equals(this.type, fan.type) && Objects.equals(this.speedSettings, fan.speedSettings) && Objects.equals(this.remoteControl, fan.remoteControl) && Objects.equals(this.oscillating, fan.oscillating)) {
                System.out.println("objects are matching");
                return true;
            }
        }
        return false;
    }
}
