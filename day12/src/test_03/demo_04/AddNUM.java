package test_03.demo_04;


import java.util.concurrent.CountDownLatch;

public class AddNUM implements Runnable {
   private CountDownLatch downLatch;

    public AddNUM(CountDownLatch downLatch) {
        this.downLatch = downLatch;
    }

    @Override
    public void run() {
        int sum=0;
        for (int i=1;i<=100;i++){

            sum= sum+i;
        }
        System.out.println("计算结果:"+sum);
        downLatch.countDown();
    }
}
