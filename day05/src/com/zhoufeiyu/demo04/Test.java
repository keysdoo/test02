package com.zhoufeiyu.demo04;

import java.util.Scanner;

//请用户从控制台输入一个“Email地址”，程序接收后判断此Email地址中是否包含@符号和.符号，如果全部包含，打印：合法，否则打印：不合法的Email地址。
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请用户从控制台输入一个“Email地址”:");
        String email=sc.next();
        if (email.contains("@.")){
            System.out.println(email);
        }else System.out.println("不合法的Email地址。");

    }
}
