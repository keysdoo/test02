package demo05;

import java.util.Collections;
import java.util.LinkedHashSet;

public class _01 {
    public static void main(String[] args) {
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        Collections.addAll(set,20,30,50,10,30,20);
        System.out.println(set.size());
        for (int a:set
             ) {
            if (a>25)
            System.out.println(a);
        }



    }
}
