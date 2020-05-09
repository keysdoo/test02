package test_02.demo_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class _01 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"王佳乐","张三丰","王思聪","张飞");
       list.stream().map(e->new Person(e)).forEach(e-> System.out.println(e.toString()));
       List<String> list1=list.stream().collect(Collectors.toList());
        for (String s:list1
             ) {
            System.out.println(s);
        }

    }
}
