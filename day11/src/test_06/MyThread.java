package test_06;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {
   // public static int a = 0;
public static AtomicInteger a=new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
           a.getAndIncrement();
        }
        System.out.println("修改完毕！");
    }
}
