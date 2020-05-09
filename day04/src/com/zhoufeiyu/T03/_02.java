package com.zhoufeiyu.T03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class _02 {

    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("请按照以下格式：yyyy-MM-dd，输入第一个生日日期！");

        Date birthday01=sdf.parse(sc.next());
        System.out.println("请按照以下格式：yyyy-MM-dd，输入第二个生日日期！");
        Date birthday02=sdf.parse(sc.next());
        Date date = new Date();
        if (birthday01.after(date)&&birthday02.after(date)){
            System.out.println("生日必须早于当前日期！");
        }else {
         if (birthday01.after(birthday02)){
             System.out.println("第一个生日小于第二个生日。");
         }else System.out.println("第一个生日大于第二个生日。");

        }






    }
}
