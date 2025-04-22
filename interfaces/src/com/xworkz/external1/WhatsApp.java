package com.xworkz.external1;

import com.xworkz.internal.rules1.ChatApp;

public class WhatsApp implements ChatApp {
    @Override
    public void send() {
        System.out.println("Running send in Whatsapp");
    }

    @Override
    public void receive() {
        System.out.println("Running receive in Whatsapp");
    }

    @Override
    public void call() {
        System.out.println("Running call in Whatsapp");
    }
}
