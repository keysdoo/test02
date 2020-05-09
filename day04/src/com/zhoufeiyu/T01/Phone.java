package com.zhoufeiyu.T01;

public class Phone {
    private String brand;
    private  String color;
    private  double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "品牌：" +brand+
                "\t颜色：" +color+
                "\t价格："+price;
    }
}
