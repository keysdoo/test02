package com.zhoufeiyu.demo04;

import java.util.Scanner;

public class _04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个java文件的文件名：");
        String test=scanner.next();
        System.out.println(test.charAt(0));
        System.out.println(test.substring(test.indexOf("."),test.length()));
        System.out.println(test.substring(0,test.indexOf(".")).concat(".java"));

    }
}
