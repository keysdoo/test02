package test_04.demo_02;

public class MyThread extends Thread {
    public static int a = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            a++;
        }
        System.out.println("修改完毕！");
    }
}
