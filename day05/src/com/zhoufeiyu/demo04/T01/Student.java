package com.zhoufeiyu.demo04.T01;

public class Student {
   private String name;
   private int age;
   private char sex;

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }


    @Override
    public String toString() {
        return   "姓名：" +name+
                "年龄:" +age+
                "性别："+sex;
    }
}
