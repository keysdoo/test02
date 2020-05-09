package com.zhoufeiyu.demo03;

public class Student {
   private String name;
   private int age;
   private double high;
   private boolean marrage;
   private char sex;

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public void setMarrage(boolean marrage) {
        this.marrage = marrage;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "姓名：" +name+
                "年龄:" +age+
                "身高：" +high+
                "婚否：" +marrage+
                "性别："+sex;
    }
}
