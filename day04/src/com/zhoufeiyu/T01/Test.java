package com.zhoufeiyu.T01;

public class Test {
    public static void main(String[] args) {
        Phone iphone = new Phone();
        iphone.setBrand("苹果");
        iphone.setColor("红色");
        iphone.setPrice(8688);
        System.out.println(iphone.toString());
        System.out.println("==================");
        Phone redmi = new Phone();
        iphone.setBrand("红米");
        iphone.setColor("红色");
        iphone.setPrice(1688);
        System.out.println(iphone.toString());

    }
}
