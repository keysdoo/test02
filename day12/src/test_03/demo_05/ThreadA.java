package test_03.demo_05;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ThreadA  implements Runnable{
    public ThreadA(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    private CyclicBarrier cyclicBarrier;
    @Override
    public void run() {
        int sum=0;
        for (int i=1;i<=10000;i++){
            sum= sum+i;
        }
        System.out.println("1--10000的所有数的累加结果:"+sum);
        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
