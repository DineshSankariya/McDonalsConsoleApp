package com.Dinesh;

public class Items {

    private String name;
    private double price;
    private double kcal;
    private int quantity;

    public Items(String name, double price, double kcal, int quantity) {
        this.name = name;
        this.price = price;
        this.kcal = kcal;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getKcal() {
        return kcal;
    }

    public void setKcal(double kcal) {
        this.kcal = kcal;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", kcal=" + kcal +
                ", quantity=" + quantity +
                '}';
    }
}
