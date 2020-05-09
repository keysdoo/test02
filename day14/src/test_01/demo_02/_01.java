package test_01.demo_02;


import java.util.ArrayList;
import java.util.Collections;

public class _01 {
    public static void main(String[] args) {

        ArrayList<String>list=new ArrayList<>();
        Collections.addAll(list,"cab","bac","acb","cba","bca","abc");
        Collections.sort(list,(String o1,String o2)->{return o2.hashCode()-o1.hashCode();});
        System.out.println(list.toString());
    }
}
