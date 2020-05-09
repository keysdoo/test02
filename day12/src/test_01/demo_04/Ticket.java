package test_01.demo_04;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
    int ticket=100;
   Lock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true){
            lock.lock();
            System.out.println(Thread.currentThread().getName()+"卖出了第"+ticket+
                    "张票");
            ticket--;
           if (ticket<1){
               break;
           }
            lock.unlock();
        }
    }
}
