package test_02._t02;

import java.util.Scanner;

public class _01 {
    public static void main(String[] args) {
        String[] arr = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("请用户输入一个整数1--7的值：");
        int num=scanner.nextInt();
        if (num>7||num<1){
            throw new RuntimeException("输入错误！！");
        }
        System.out.println("程序提示："+arr[num-1]);

    }
}
