package com.xworkz.internal;

public class Tool {
    final String name;
    final String use;
    public Tool(String name, String use) {
        this.name = name;
        this.use = use;
    }
    @Override public String toString() {
        return "Tool [name=" + name + ", use=" + use + "]";
    }
}

