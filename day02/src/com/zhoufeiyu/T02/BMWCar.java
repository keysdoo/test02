package com.zhoufeiyu.T02;

public class BMWCar extends Car implements GPS {

    public BMWCar(String brand, double prices) {
        super(brand, prices);
        System.out.println(brand+"汽车" + "售价:" + prices+"元");
        gps();

    }

    @Override
    public void gps() {
        System.out.println("搭载了GPS导航系统！");
    }
}
