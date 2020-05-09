package test_01.demo_04;

import java.io.FileReader;
import java.io.IOException;

public class _01 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("student.txt");
        int len;
        while ((len=fr.read())!=-1) {
            System.out.println((char)len);
        }
        fr.close();
    }
}
