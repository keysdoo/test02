package test_01.demo_02;

import java.io.File;
import java.io.IOException;

public class _01 {
    public static void main(String[] args) throws IOException {
        File file1=new File("test.txt");
        File file2=new File("一级目录");
        File file3=new File("目录A/目录B/目录C");
        System.out.println(" 判断file1是否存在？如果不存在，创建这个文件。");
        if (file1.exists()==false){
            file1.createNewFile();
        }
        System.out.println(" 判断file2是否存在？如果不存在，创建这个目录。");
        if (file2.exists()==false){
            file2.mkdir();
        }
        System.out.println(" 判断file3是否存在？如果不存在，创建这个多级目录。");
        if (file3.exists()==false){
            file3.mkdirs();
        }
    }
}
