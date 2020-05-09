package test_03.demo_02;

import java.util.concurrent.CopyOnWriteArraySet;

public class AddNum2 implements Runnable {
    CopyOnWriteArraySet<Integer> list=new CopyOnWriteArraySet<>();

    public AddNum2(CopyOnWriteArraySet<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i=1;i<=10000;i++) {
            list.add(i);
        }
    }
}
