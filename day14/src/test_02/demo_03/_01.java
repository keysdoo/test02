package test_02.demo_03;

import java.util.ArrayList;
import java.util.Collections;

public class _01 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"张三丰","王思聪","张飞","刘晓敏","张靓颖");
        System.out.println(list.stream().filter(e -> e.startsWith("张")).count());
    }
}


