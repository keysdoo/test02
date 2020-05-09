package com.zhoufeiyu.T03;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("请按照以下格式：yyyy-MM-dd，输入生日日期！");

        Date birthday=sdf.parse(sc.next());
        Date date =new Date();
        if (birthday.after(date)){
            System.out.println("生日必须早于当前日期！");
        }else {
            long m1=birthday.getTime();
            long m2=date.getTime();
            System.out.println("出生到现在一共经历了：" + ((m2 - m1) / 1000 / 3600 / 24) + " 天");
        }








    }
}
