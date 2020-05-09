package com.zhoufeiyu.T06;

public class _01 {
    public static void main(String[] args) {
        int[] arr = {55,77,0,88,22,44,33};

        System.arraycopy(arr,3,arr,2,4);
        arr[arr.length-1]=0;
        for (int a:arr
             ) {
            System.out.println(a);
        }
    }
}
