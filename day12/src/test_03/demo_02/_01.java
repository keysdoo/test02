package test_03.demo_02;

import java.util.concurrent.CopyOnWriteArraySet;

public class _01 {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArraySet<Integer> list=new CopyOnWriteArraySet();
        new Thread(new AddNum1(list),"线程1").start();
        new Thread(new AddNum2(list),"线程2").start();
        Thread.sleep(5000);

        for (Integer n:list
        ) {
            System.out.println(n);
        }
        System.out.println("最终集合的长度：" + list.size());

    }
}
