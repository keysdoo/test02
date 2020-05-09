package com.zhoufeiyu.demo04;

import java.util.Scanner;

public class _02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请用户输入一个发帖内容:");
        String sentences=scanner.next();
        sentences= sentences.replace("特朗普","*");
        System.out.println(sentences);

    }
}
