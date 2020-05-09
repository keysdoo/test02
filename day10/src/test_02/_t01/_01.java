package test_02._t01;

import java.math.BigDecimal;

import java.util.Scanner;

public class _01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("第一个数");
       Integer num1=scanner.nextInt();

        System.out.println("第二个数");
        Integer  num2 = scanner.nextInt();
       if (num2==0){
           throw new RuntimeException("第二个数不能为0！！");
       }
        BigDecimal num3=new BigDecimal(num1);
       BigDecimal num4=new BigDecimal(num2);
        System.out.println(num3.divide(num4, 2));


    }
}
