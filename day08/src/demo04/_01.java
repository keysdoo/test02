package demo04;


import java.util.Collections;
import java.util.HashSet;

public class _01 {
    public static void main(String[] args) {
        HashSet <Student>set=new HashSet();

        Collections.addAll(set,new Student("张三",20,'男'),new Student("李四",21,'女'),new Student("张三",20,'男'));
        for (Student s:set
             ) {
            System.out.println(s.toString());
        }

    }
}
