package com.zhoufeiyu.T02;

public class Test {

    public static void main(String[] args) {
         Student student01 = new Student("李明","男",24);
         Student student02 = new Student("李雪","女",24);

        System.out.println(student01.equals(student02));
        System.out.println("==============================");
        student01.setName(student02.getName());
        student01.setAge(student02.getAge());
        student01.setSex(student02.getSex());
        System.out.println(student01.equals(student02));
    }
}
