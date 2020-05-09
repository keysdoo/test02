package test03.t02;


import java.util.TreeSet;

public class _01 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        while (set.size()<6){
           set.add((int)(Math.random()*33 + 1));
       }


        System.out.println("篮球：" +(int)(Math.random()*16+1)+
                "\t红球："+ set);
    }
}
