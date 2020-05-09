package test_03.demo_01;

import java.util.concurrent.CopyOnWriteArrayList;

public class _01 {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        new Thread(new AddNumber1(list),"线程1").start();
        new Thread(new AddNumber2(list),"线程2").start();
        Thread.sleep(5000);

        for (Integer n:list
             ) {
            System.out.println(n);
        }
        System.out.println("最终集合的长度：" + list.size());
    }
}
