package test_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



/**
 * 、
 *
 * 如上图所示:有五名学生参加注册会计师考试,表格中记录的是5名学生的考试成绩.
 *
 * 要求如下:
 *
 *     1.定义一个学生类,定义id(学号),name(姓名),score(分数),提供对应的get/set,以及空参和满参构造方法
 *
 *     2.定义测试类
 *
 *         2.1.定义一个ArrayList集合 list
 *
 *         2.2.创建5个学生对象
 *
 *         2.3.调用add方法将5个学生信息存到list集合中
 *
 *         2.4.利用Collections中的sort方法将5个学生按照考试成绩进行从大到小的排序
 *
 *         2.5.遍历集合,将属性值输出出来
 *
 *        2.6 删除前三名以后的考生
 *
 *         2.7 打印前三名同学信息
 */
public class test {
    public static void main(String[] args) {
        ArrayList<Student>list=new ArrayList<>();
        Student student1 = new Student("张三",1,98);
        Student student2= new Student("李四",2,86);
        Student student3= new Student("王五",3,90);
        Student student4 = new Student("赵六",4,89);
        Student student5= new Student("麻七",5,76);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getScore()-o1.getScore();
            }
        });
        for (Student stu:list
             ) {
            System.out.println(stu.toString());

        }
        System.out.println("======================================");
        for (int i=2;i<list.size();i++)
        list.remove(i);
        for (Student stu:list
        ) {
            System.out.println(stu.toString());

        }
    }
}
