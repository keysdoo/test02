package com.zhoufeiyu.T02;

public  class Car extends Vehicle {

    @Override
    public void runing() {
        System.out.println("四个轮子在地上跑！");
    }

    public Car(String brand, double prices) {
        super(brand, prices);
    }
}
