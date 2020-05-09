package test_03.demo_05;

import java.util.concurrent.CyclicBarrier;

public class _01 {
    public static void main(String[] args) {


        CyclicBarrier cyclicBarrier = new CyclicBarrier(3,new ThreadD());

        new Thread(new ThreadA(cyclicBarrier),"A").start();
        new Thread(new ThreadB(cyclicBarrier),"B").start();
        new Thread(new ThreadC(cyclicBarrier),"C").start();

    }
}
