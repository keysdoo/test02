package test_01;


import java.util.Calendar;
import java.util.Scanner;

public class _01{
    public static void main(String[] args) {
        //1.定义scanner对象,调用nextint方法键盘输入一个年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入年份:");
        int year=sc.nextInt();//错误1已更正
        //2.调用getinstance()方法获取calendar对象
        Calendar calendar=Calendar.getInstance();

        //3.调用calendar中的set方法设置年,月,日
        calendar.set(year,2,1);//代表三月一日 错误2已修正
        //4.调用calendar中的add方法,让三月一日减去一天,就是二月的最后一天
        calendar.add(Calendar.DATE,-1);//错误3已修正
        //5.调用Calendar中的get方法,获取得出的日期
        int day=calendar.get(Calendar.DAY_OF_MONTH);//错误4已修正
        //6.输出输入的年份二月有多少天
        System.out.println(year+"年的二月有"+day+"天");
        //7.判断,如果得出的日期==28天,证明是平年,共365天,否则就是闰年,共366天
        if (day==28){//错误5已修正
            System.out.println(year+"年是平年!共365天");
        }else {
            System.out.println(year+"年是闰年!共366天");
        }


    }
}