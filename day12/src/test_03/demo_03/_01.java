package test_03.demo_03;



import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class _01 {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
      new Thread(new AddNUM1(map),"线程1").start();
      new Thread(new AddNUM2(map),"线程2").start();
      Thread.sleep(5000);
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();


        for (Map.Entry<Integer,Integer> e:entries
             ) {
            System.out.println(e);

        }
        System.out.println("最终集合的长度：" + map.size());
    }


}
