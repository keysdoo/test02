package com.zhoufeiyu.demo04;
//请用户从控制台输入一个java文件的名字，例如：Test.java，请编程实现以下功能：
//
//        Ø 判断此文件名是否以“.java”结尾，并打印结果
//
//        Ø 获取此文件中.符号的索引位置，并打印结果


import java.util.Scanner;

public class _01 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请用户从控制台输入一个java文件的名字:");
        String  test=sc.next();
        if (test.endsWith(".java")){
            System.out.println(test);
            System.out.println(test.indexOf("."));
        }else System.out.println("不是java文件。");
    }
}
