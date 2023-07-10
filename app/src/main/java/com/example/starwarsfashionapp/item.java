package com.example.starwarsfashionapp;

public class item {

    String name;
    String outlet;
    String price;
    String quantity;
    int image;

    public item(String name, String outlet, String price, String quantity,int image) {
        this.name = name;
        this.outlet = outlet;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getOutlet() {
        return outlet;
    }

    public void setOutlet(String email) {
        this.outlet = email;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}