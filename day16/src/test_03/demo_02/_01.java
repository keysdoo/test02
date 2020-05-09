package test_03.demo_02;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;


public class _01{
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        pro.load(new FileReader("test2_1.txt"));
        FileInputStream fileInputStream = new FileInputStream("test2_1.txt");
        int len;
        while ((len=fileInputStream.read())!=-1){
            System.out.println( len);
        }
       
        Set<String> strings = pro.stringPropertyNames();
        for (String string : strings) {
            System.out.println(string+"--"+pro.getProperty(string));
        }
    }
}
