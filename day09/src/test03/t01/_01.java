package test03.t01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class _01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        Collections.addAll(arrayList,"a","f","b","c","a","d");
        HashSet<String> set=new HashSet<>();
        for (String s:arrayList
             ) {
            set.add(s);
        }
        System.out.println(set);
    }
}
