public class ElectronicsRunner {
    public static void main(String[] args) {
        Electronics device1 = new Electronics();
        device1.info();

        String brand = "Samsung";
        String model = "Galaxy S23";
        Electronics device2 = new Electronics(brand, model);
        device2.info();

        brand = "Sony";
        model = "Bravia X90J";
        String category = "Television";
        Electronics device3 = new Electronics(brand, model, category);
        device3.info();

        brand = "Apple";
        model = "MacBook Pro";
        category = "Laptop";
        double price = 2499.99;
        double weight = 2.1;
        Electronics device4 = new Electronics(brand, model, category, price, weight);
        device4.info();

        brand = "Dell";
        model = "XPS 15";
        category = "Laptop";
        price = 1899.99;
        weight = 2.0;
        String color = "Silver";
        int warrantyPeriod = 24;
        boolean isRechargeable = true;
        double powerConsumption = 65.0;
        String madeIn = "USA";
        Electronics device5 = new Electronics(brand, model, category, price, weight, color, warrantyPeriod, isRechargeable, powerConsumption, madeIn);
        device5.info();
    }
}
