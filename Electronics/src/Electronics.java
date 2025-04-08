public class Electronics {
    String brand;
    String model;
    String category;
    double price;
    double weight;
    String color;
    int warrantyPeriod;
    boolean isRechargeable;
    double powerConsumption;
    String madeIn;

    public Electronics() {
        System.out.println("No parameter constructor called.");
    }

    public Electronics(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Electronics(String brand, String model, String category) {
        this(brand,model);
        this.category = category;
    }

    public Electronics(String brand, String model, String category, double price, double weight) {
        this(brand,model,category);
        this.price = price;
        this.weight = weight;
    }

    public Electronics(String brand, String model, String category, double price, double weight, String color, int warrantyPeriod, boolean isRechargeable, double powerConsumption, String madeIn) {
        this(brand,model,category,price,weight);
        this.color = color;
        this.warrantyPeriod = warrantyPeriod;
        this.isRechargeable = isRechargeable;
        this.powerConsumption = powerConsumption;
        this.madeIn = madeIn;
    }

    public void info() {
        System.out.println("Brand: " + brand +
                ", Model: " + model +
                ", Category: " + category +
                ", Price: " + price +
                ", Weight: " + weight +
                ", Color: " + color +
                ", Warranty: " + warrantyPeriod +
                " months, Rechargeable: " + isRechargeable +
                ", Power Consumption: " + powerConsumption +
                ", Made In: " + madeIn);
    }
}
