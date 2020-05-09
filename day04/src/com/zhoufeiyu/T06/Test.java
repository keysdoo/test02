package com.zhoufeiyu.T06;

public class Test {
    public static void main(String[] args) {
        int[] arr = {10,27,8,5,2,1,3,55,88};
        int[] arr1=new int[5];
        System.arraycopy(arr,2,arr1,0,5);
        for (int a:arr1
             ) {
            System.out.println(a);
        }
    }
}
