package demo02.T02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

public class _01 {

    public static void main(String[] args) {

        Collection<Double> coll = new ArrayList<>();
        coll.add(88.5);
        coll.add(39.2);
        coll.add(77.1);
        coll.add(56.8);
        coll.add(89.0);
        coll.add(99.0);
        coll.add(59.5);
        for (double n : coll
        ) {
            System.out.println(n);
        }
        System.out.println("====================");
        for (double n:coll
             ) {
            if (n<60){
                System.out.println(n);
            }
        }
        System.out.println("======================");
        int count=0;
        double sum=0;
        for (double n:coll
             ) {
            if (n<60){
                count++;
            }
            sum+=n;
        }
        Double sum0=sum;
        BigDecimal average=new BigDecimal(sum0.toString());
            Integer num=coll.size();
          BigDecimal num1=new BigDecimal(num.toString());
        System.out.println("不及格人数："+count);

        System.out.println("平均分："+average.divide(num1,2));
        System.out.println("=========================================");
        double max=((ArrayList<Double>) coll).get(0);
        for (double n:coll
             ) {
            if (n>=max)
                max=n;
        }
        System.out.println("最高分："+max);

    }

}
