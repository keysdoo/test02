package test_03.demo_01;

import java.util.concurrent.CopyOnWriteArrayList;

public class AddNumber1 implements Runnable {
    public AddNumber1(CopyOnWriteArrayList<Integer> list) {
        this.list = list;
    }

    CopyOnWriteArrayList<Integer>list= new CopyOnWriteArrayList();
    @Override
    public void run() {
for (int i=10001;i<=20000;i++){
    list.add(i);

}

    }

}
