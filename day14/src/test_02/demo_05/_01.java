package test_02.demo_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class _01 {

        public static void main(String[] args) {
            ArrayList<String> list=new ArrayList<>();
            Collections.addAll(list,"张三丰","王思聪","张飞","刘晓敏","张靓颖","王敏");
            Stream stream=list.stream().filter(e->e.startsWith("张"));
            Stream stream1=list.stream().filter(e->e.startsWith("王"));
            Stream.concat(stream,stream1).forEach(e-> System.out.println(e));
        }
    }

