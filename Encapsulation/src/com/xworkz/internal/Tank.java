package com.xworkz.internal;

public class Tank {
    private String capacity;
    private String material;
    private String color;
    private String shape;
    private String brand;

    void SetCapacity(String capacity) {
        this.capacity = capacity;
    }

    void SetMaterial(String material) {
        this.material = material;
    }

    void SetColor(String color) {
        this.color = color;
    }

    void SetShape(String shape) {
        this.shape = shape;
    }

    void SetBrand(String brand) {
        this.brand = brand;
    }

    public String GetCapacity() {
        return this.capacity;
    }

    public String GetMaterial() {
        return this.material;
    }

    public String GetColor() {
        return this.color;
    }

    public String GetShape() {
        return this.shape;
    }

    public String GetBrand() {
        return this.brand;
    }

}
