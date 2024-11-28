package com.example.kiosk;

public class MenuItem {
    private String name;        // 이름
    private double price;       // 가격
    private String priceInfo;   // 설명

    public MenuItem(String name, double price, String priceInfo) {
        this.name = name;
        this.price = price;
        this.priceInfo = priceInfo;
    }

    // Getter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceInfo() {
        return priceInfo;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPriceInfo(String priceInfo) {
        this.priceInfo = priceInfo;
    }
}
