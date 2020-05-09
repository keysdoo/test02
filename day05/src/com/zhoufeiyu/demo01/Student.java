package com.zhoufeiyu.demo01;

public class Student {
    private String name;
    private  String sex;
    private  int age;
    private  double  grade;

    public Student(String name, String sex, int age, double grade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }
}
