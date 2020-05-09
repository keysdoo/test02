package test_03.demo_01;

import java.util.concurrent.CopyOnWriteArrayList;

public class AddNumber2 implements Runnable {
    public AddNumber2(CopyOnWriteArrayList<Integer> list) {
        this.list = list;
    }

    CopyOnWriteArrayList<Integer> list= new CopyOnWriteArrayList();
    @Override
    public void run() {
        for (int i=1;i<=10000;i++) {
            list.add(i);
        }
    }
}
