package com.example.mongospringexample.model;

public class Purchase {

    private String itemId;
    private  String itemDesc;
    private double price;

    public Purchase(String itemId, String itemDesc, double price) {
        this.itemId = itemId;
        this.itemDesc = itemDesc;
        this.price = price;
    }

    public Purchase() {
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
