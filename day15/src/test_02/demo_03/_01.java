package test_02.demo_03;

import java.io.File;

public class _01 {
    public static void main(String[] args) {
        File file = new File("D:\\多级目录");
        printfile(file);
    }
    public static void printfile(File file){
        File[] files=file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getName()+"绝对路径:" +
                    "" + file1.getAbsolutePath());
            if (file1.isDirectory()){
                printfile(file1);

            }
        }
    }
}
