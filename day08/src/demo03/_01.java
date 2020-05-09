package demo03;


import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;


public class _01 {
    public static void main(String[] args) {
        HashSet <String>set=new HashSet();

        Collections.addAll(set,"刘备","关羽","张飞","刘备","张飞");
        System.out.println(set.size());
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("=====================================");
        for (String n:set
             ) {
            System.out.println(n);
        }

    }




}
