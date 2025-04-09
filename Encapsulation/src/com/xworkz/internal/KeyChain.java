package com.xworkz.internal;

public class KeyChain {
    private String material;
    private String color;
    private String shape;
    private String keyType;
    private String brand;

    void setMaterial(String material) {
        this.material = material;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setShape(String shape) {
        this.shape = shape;
    }

    void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getColor() {
        return this.color;
    }

    public String getShape() {
        return this.shape;
    }

    public String getKeyType() {
        return this.keyType;
    }

    public String getBrand() {
        return this.brand;
    }
}
