package test_03.deom_01;


import java.io.FileNotFoundException;

import java.io.PrintStream;
import java.util.Properties;

public class _01 {
    public static void main(String[] args) throws FileNotFoundException {
        Properties pro = new Properties();
        pro.setProperty("Ʒ��","Iphone11 Pro Max");
        pro.setProperty("��ɫ","��ҹ��");
        pro.setProperty("�洢����","256G");
        pro.setProperty("�۸�","10899");
        PrintStream printStream = new PrintStream ("test2_1.txt");
        pro.list(printStream);
        printStream.close();

    }
}
