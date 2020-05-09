package test_03.demo_07;

import java.util.concurrent.Exchanger;

public class ThreadB implements Runnable {
    private Exchanger<String> exchanger;

    public ThreadB(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run(){
        try {
            System.out.println(Thread.currentThread().getName()+exchanger.exchange("一条体育新闻"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
