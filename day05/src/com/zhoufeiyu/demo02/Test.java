package com.zhoufeiyu.demo02;


import java.util.Arrays;

//
//​	有以下数组定义：
//
//        ​		int[] arr = {1,332,43,25,3324,34,335,4,45,2,43,52,54};
//
//        ​	要求：
//
//        Ø 请打印数组所有元素
//
//        Ø 请对数组元素进行“升序”排序
//
//        Ø 请对排序后的数组再次打印。
public class Test {

    public static void main(String[] args) {
        int[] arr = {1,332,43,25,3324,34,335,4,45,2,43,52,54};
        //        Ø 请打印数组所有元素
        System.out.println(Arrays.toString(arr));
        System.out.println("=========================");
        //        Ø 请对数组元素进行“升序”排序
        Arrays.sort(arr);
        //        Ø 请对排序后的数组再次打印。
        System.out.println(Arrays.toString(arr));


    }
}
