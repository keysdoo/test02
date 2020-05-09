package com.zhoufeiyu.T02;

public abstract  class Vehicle  {
    private String brand;
    private  double prices;
    public abstract void runing();

    public Vehicle(String brand, double prices) {
        this.brand = brand;
        this.prices = prices;
    }
}
