package test_01.demo_03;



import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class _01 {
    public static void main(String[] args) throws IOException {
        List<Student> stuList = new ArrayList<>();
        FileOutputStream fos=new FileOutputStream("student.txt");

	stuList.add(new Student("张三","男","20","88"));
	stuList.add(new Student("李四","女","19","99"));
	stuList.forEach((e-> {
        try {
            fos.write(e.getName().getBytes());
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            fos.write(',');
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            fos.write(e.getSex().getBytes());
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            fos.write(',');
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            fos.write(e.getAge().getBytes());
        } catch (IOException e1) {
            e1.printStackTrace();
        }


        try {
            fos.write(',');
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            fos.write(e.getScore().getBytes());
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            fos.write("\n".getBytes());
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }));
fos.close();

    }
}
