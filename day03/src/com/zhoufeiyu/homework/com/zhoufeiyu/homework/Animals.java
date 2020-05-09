package com.zhoufeiyu.homework.com.zhoufeiyu.homework;

public class Animals {
    private String name;
    private int age;
    private  boolean sex;

    public Animals(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Animals() {
    }

    public void behavior (){
        System.out.println("吃东西。。。");
    }
}
