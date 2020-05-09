package test_01.demo_02;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\test.txt");
        FileOutputStream fos=new FileOutputStream("copy_02.txt");
        byte[] a=new byte[1024];
        int len;
        while ((len=fis.read(a))!=-1){
            fos.write(a,0,len);
        }
        fis.close();
        fos.close();
    }
}
