package com.xworkz.internal;

public class Switch extends Component {
    public void toggle() {
        System.out.println("Toggling switch");
    }

    @Override
    public void wire() {
        System.out.println("Wiring switch");
    }
}