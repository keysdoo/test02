package com.zhoufeiyu.demo01;
//​	有以下学员信息：
//
//        ​		张三,男,20,79.5
//
//        ​		"李四","女",21,80.2
//
//        ​		"王五","男",22,77.9
//
//        ​		"周六","男",20,55.8
//
//        ​		"赵七","女",21,99.9
//
//        ​	请定义学员类，属性：姓名、性别、年龄、分数
//
//        ​	请编写测试类，创建5个对象，分别存储上述值，并计算5名学员的“平均分”(四舍五入到小数点后2位)。


import java.util.ArrayList;

public class _01 {

    public static void main(String[] args) {
        Student student0 = new Student("张三","男",20,79.5);
        Student student1 = new Student("李四","女",21,80.2);
        Student student2 = new Student("王五","男",22,77.9);
        Student student3 = new Student("周六","男",20,55.8);
        Student student4 = new Student("赵七","女",21,99.9);
        ArrayList<Student>arrayList=new ArrayList<>();
       arrayList.add(student0);
       arrayList.add(student1);
       arrayList.add(student2);
       arrayList.add(student3);
       arrayList.add(student4);
       Double average=MathAverage.average(arrayList);
        System.out.println("5名学员的“平均分”:" +average.toString()
               );
    }
}
