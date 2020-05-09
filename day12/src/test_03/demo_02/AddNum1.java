package test_03.demo_02;

import java.util.concurrent.CopyOnWriteArraySet;

public class AddNum1 implements Runnable {
    CopyOnWriteArraySet<Integer> list=new CopyOnWriteArraySet<>();

    public AddNum1(CopyOnWriteArraySet<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i=10001;i<=20000;i++){
            list.add(i);

        }
    }
}
