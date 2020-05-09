package com.zhoufeiyu.T02;

public class Student {
    private String name;
    private String sex;
    private  int age;

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override

    public boolean equals(Object obj) {


        if (this==obj){
            return true;
        }
        Student obj1=(Student)obj;

        if (this.name.equals(obj1.name)&&this.sex.equals(obj1.getSex())&&this.age==obj1.getAge()){
            return true ;
        }else return false;

    }
}
