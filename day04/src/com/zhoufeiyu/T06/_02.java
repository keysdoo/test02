package com.zhoufeiyu.T06;

import java.util.ArrayList;

public class _02 {
    public static void main(String[] args) {

  ArrayList<Integer> arr=new ArrayList<>();
 long m1= System.currentTimeMillis();
  for (int i=0;i<10000000;i++){
      arr.add((int) Math.random());
  }
  long m2=System.currentTimeMillis();
        System.out.println(m2-m1);

    }

}
