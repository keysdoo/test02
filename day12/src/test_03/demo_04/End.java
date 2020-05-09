package test_03.demo_04;

import java.util.concurrent.CountDownLatch;

public class End implements Runnable{
  private   CountDownLatch downLatch;

    public End(CountDownLatch downLatch) {
        this.downLatch = downLatch;
    }

    @Override
    public void run() {
        try {
            downLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("计算完毕");

    }
}
