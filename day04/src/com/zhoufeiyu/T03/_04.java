package com.zhoufeiyu.T03;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class _04 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("请按照以下格式：yyyy-MM-dd，输入日期！");
        //解析
        Date date=sdf.parse(scanner.next());

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 ");
        //格式化
        System.out.println(sdf2.format(date));

    }

}
