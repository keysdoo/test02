package test_03.demo_04;

import java.util.concurrent.CountDownLatch;

public class _01 {
    public static void main(String[] args) {

        CountDownLatch downLatch = new CountDownLatch(1);
        new Thread(new AddNUM(downLatch),"A").start();
        new Thread(new End(downLatch),"B").start();


    }
}
