package demo05;

import java.util.Collections;
import java.util.TreeSet;

public class _02 {
    public static void main(String[] args) {
        TreeSet<Integer>set=new TreeSet<>();
        Collections.addAll(set,30,20,50,10,30,20);
        System.out.println(set.size());
        for (int a:set
             ) {
            if (a>25)
                System.out.println(a);
        }
    }
}
