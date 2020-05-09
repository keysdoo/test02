package com.zhoufeiyu.demo03;

import java.util.Scanner;

//请从控制台接收一个整数的“分数”值，要求用String类型的变量存储，程序可以将这个String类型的分数值转换为int值，并将分数 + 5分后打印到控制台。
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String grade=sc.next();
        int grade1=Integer.valueOf(grade);
        System.out.println("分数："+(grade1+5));
    }
}
