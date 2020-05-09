package demo02;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class _01 {
    public static void main(String[] args) {
        ArrayList <Integer>coll=new ArrayList();
        coll.add(100);
        coll.add(300);
        coll.add(200);
        coll.add(50);
        Collections.shuffle(coll);
        System.out.println(coll);
        System.out.println("===================");
        Collections.sort(coll);
        System.out.println(coll);
        System.out.println("====================");
        Collections.sort(coll, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(coll);
    }

}
