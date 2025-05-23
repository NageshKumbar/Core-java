package dto;

import java.util.Date;

public class UserDetailsDto {
    String name;
    String type;
    int Iprice;
    int Sprice;
    double mrp;
    String description;
    String brand;
    int quantity;
    String colour;
    double weight;
    String mfd;
    String Warranty;
    boolean check;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIprice(int iprice) {
        this.Iprice = iprice;
    }

    public void setSprice(int sprice) {
        this.Sprice = sprice;
    }

    public void setMrp(double mrp) {
        this.mrp = mrp;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMfd(String mfd) {
        this.mfd = mfd;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public void setWarranty(String warranty) {
        Warranty = warranty;
    }

    public double getWeight() {
        return weight;
    }

    public String getMfd() {
        return mfd;
    }

    public double getMrp() {
        return mrp;
    }

    public int getIprice() {
        return Iprice;
    }

    public boolean isCheck() {
        return check;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getSprice() {
        return Sprice;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getWarranty() {
        return Warranty;
    }
}
