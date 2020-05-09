package test_03.demo_03;

import java.util.concurrent.ConcurrentHashMap;

public class AddNUM2 implements Runnable {
    ConcurrentHashMap<Integer,Integer> map=new ConcurrentHashMap<>();

    public AddNUM2(ConcurrentHashMap<Integer, Integer> map) {

        this.map = map;
    }

    @Override
    public void run() {
        for (int i=10001;i<=20000;i++){
            map.put(i,i);
        }
    }
}
