package com.zhoufeiyu.demo04.T01;




import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Student student = new Student();
        System.out.println("输入学员信息：");
         String information=sc.next();

        information= information.trim();
         String[]str=  information.split(",");
         student.setName(str[0]);
         student.setAge(Integer.parseInt(str[1]));
         student.setSex(str[2].charAt(0));
        System.out.println(student.toString());

    }
}
