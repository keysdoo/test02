package T1;

import java.util.Random;

public class test111 {
    public static void main(String[] args) {
        int [] arr=new int[5];//错误一已修正；
        Random r=new Random();
        for (int i=0;i<arr.length;i++){
            arr[i]=r.nextInt(99)+1;//错误二已修正；

        }
        System.out.println();
        comp(arr);//错误三已修正

    }
    public static void comp(int [] arr){
        int max=arr[0];
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if (max<arr[i]){
               max =arr[i];//错误四已修正；
            }
            if (min>arr[i]){//错误五已修正；
                min=arr[i];
            }
        }
        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);

    }
}
