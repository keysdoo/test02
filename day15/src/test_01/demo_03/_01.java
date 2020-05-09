package test_01.demo_03;

import java.io.File;

public class _01 {
    public static void main(String[] args) {
        File file = new File("D:\\多级目录");
        for (String s : file.list()) {
            System.out.println(s);

        }

        System.out.println("===========================");
        printfiles(file);


    }
public static void printfiles(File file){
        File[]files=file.listFiles();
    for (File file1 : files) {
        if (file1.isFile()){
            System.out.println(file1.getName()+"【文件】" +
                    file1.getAbsolutePath());
        }
        if (file1.isDirectory()){
            System.out.println(file1.getName()+"【目录】" +
                    file1.getAbsolutePath());
            printfiles(file1);
        }


    }

}


}
