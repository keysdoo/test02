package test_03.demo_03;

import java.util.concurrent.ConcurrentHashMap;

public class AddNUM1 implements Runnable {
    ConcurrentHashMap<Integer,Integer> map=new ConcurrentHashMap<>();

    public AddNUM1(ConcurrentHashMap<Integer, Integer> map) {

        this.map = map;
    }

    @Override
    public void run() {
for (int i=1;i<=10000;i++){
    map.put(i,i);
}
    }
}
