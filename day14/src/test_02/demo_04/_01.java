package test_02.demo_04;

import java.util.ArrayList;
import java.util.Collections;

public class _01 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张三丰","王思聪","张飞","刘晓敏","张靓颖","王敏");
       list.stream().filter(e->e.startsWith("张")).limit(2).forEach(e-> System.out.println(e));
       list.stream().filter(e->e.startsWith("王")).skip(1).forEach(e-> System.out.println(e));
    }
}
