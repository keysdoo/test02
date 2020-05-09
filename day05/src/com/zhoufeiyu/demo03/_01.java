package com.zhoufeiyu.demo03;
//
//l 请定义学员类，有以下成员属性：
//        ​		姓名：String类型
//        ​		年龄：int
//        ​		身高：double
//        ​		婚否：boolean
//        ​		性别：char

//        l 请从控制台接收以下数据：
//        ​		姓名：王哈哈
//        ​		年龄：24
//        ​		身高：1.82
//        ​		婚否：false
//        ​		性别：男
//
//        ​		**以上数据要求全部使用String类型接收**
//
// l 请创建“学员对象”，并将所有数据转换后，存储到这个对象中，最后打印此对象的所有属性。

import java.util.Scanner;

public class _01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student student = new Student();
        System.out.println("请输入学员的姓名：");
        student.setName(sc.next());
        System.out.println("请输入学员的年龄：");
        student.setAge(Integer.parseInt(sc.next()));
        System.out.println("请输入学员的身高：");
        student.setHigh(Double.parseDouble(sc.next()));
        System.out.println("请输入学员的婚否：");
        student.setMarrage(Boolean.parseBoolean(sc.next()));
        System.out.println("请输入学员的性别：");
        student.setSex(sc.next().charAt(0));
        System.out.println(student.toString());
    }

}
