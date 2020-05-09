package test_01.demo_01;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class _01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\test.txt");
        FileOutputStream fos=new FileOutputStream("copy.txt");
        int len;
        while ((len=fis.read())!=-1){
            fos.write(len);
        }
        fis.close();
        fos.close();
    }
}
