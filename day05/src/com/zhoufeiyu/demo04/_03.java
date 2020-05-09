package com.zhoufeiyu.demo04;

import java.util.Scanner;

public class _03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请用户输入一个发帖内容:");
        String sentences=scanner.next();
        String[] keyArray = {"特朗普","普京"};
        for (int i=0;i<keyArray.length;i++){
            sentences= sentences.replace(keyArray[i],"*");
        }
        System.out.println(sentences);


    }
}
