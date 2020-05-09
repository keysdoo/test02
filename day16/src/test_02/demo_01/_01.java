package test_02.demo_01;

import java.io.FileWriter;


public class _01 {
    public static void main(String[] args) {

         try (FileWriter fw = new FileWriter("test_03.txt");){
             fw.write("helloworld");
         }catch (Exception e){
             e.printStackTrace();
         }




    }
}
