package test_01.demo_01;

import java.io.File;

public class _01 {
    public static void main(String[] args) {
        File file1=new File("D:\\test1.txt");
        File file2=new File("D:\\测试目录");
        System.out.println("获取、打印file1的绝对路径；"+file1.getAbsolutePath());
        System.out.println("获取、打印file2的绝对路径；"+file2.getAbsolutePath());
        System.out.println("获取、打印file1的文件名和目录名；"+file1.getName());
        System.out.println("获取、打印file2的文件名和目录名；"+file2.getName());
        System.out.println("获取、打印file1的文件大小；"+file1.length());
        System.out.println("获取、打印file2的文件大小；"+file2.length());
        System.out.println("判断file1是否存在；"+file1.exists());
        System.out.println("判断file1是否存在；"+file2.exists());
        System.out.println("判断file1是否是文件？"+file1.isFile());
        System.out.println("判断file1是否是目录？"+file1.isDirectory());
        System.out.println("判断file2是否是文件?"+file2.isFile());
        System.out.println("判断file2是否是目录？"+file2.isDirectory());

    }
}
