package test_03.demo_07;

import java.util.concurrent.Exchanger;

public class ThreadA implements Runnable {
    public ThreadA(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    private Exchanger<String> exchanger;
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+exchanger.exchange("一条娱乐新闻"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
