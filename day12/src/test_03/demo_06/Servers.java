package test_03.demo_06;

import java.util.concurrent.Semaphore;

public class Servers  {
    private Semaphore semaphore =new Semaphore(3);
    public  void method() throws InterruptedException {
        semaphore.acquire();
        Thread.sleep(2000);
        semaphore.release();
    }
}
