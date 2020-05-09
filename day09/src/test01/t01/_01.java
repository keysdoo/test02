package test01.t01;


import java.util.HashMap;

import java.util.Map;
import java.util.Set;

public class _01 {

    public static void main(String[] args) {

        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(1,"王五");
        System.out.println("map大小："+map.size());
        Set<Integer> set=map.keySet();
        for (int n:set
             ) {
            System.out.println("key:" +n+
                    "value:"+
                    map.get(n));
        }
        System.out.println("=================================");
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer,String> entry:entrySet) {
            System.out.println("key:"+entry.getKey()+"value:" +
                    entry.getValue());

        }
        System.out.println("======================");
        System.out.println(map.get(1));
        System.out.println("=========================");
        System.out.println(map.get(10));
        System.out.println("=========================");
        System.out.println(map.containsKey(10));
        System.out.println("===================");
        map.remove(1);
        System.out.println(map);



    }
}
