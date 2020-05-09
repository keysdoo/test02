package com.zhoufeiyu.demo01;




import java.math.BigDecimal;
//请编程计算它们的总值及平均值(四舍五入保留小数点后2位)

public class Test {
    public static void main(String[] args) {
        double[] arr = {0.1,0.2,2.1,3.2,5.56,7.21};


        double sum=0;

        for (double n:arr
        ) {
            Double temp=sum;
            Double temp1=n;

            sum=new BigDecimal(temp.toString()).add(new BigDecimal(temp1.toString())).doubleValue();

        }
        Double average=sum;
        Integer size=arr.length;
        BigDecimal bigDecimal = new BigDecimal(size.toString());



        System.out.println("它们的总值:" +sum+
                "它们的平均值" +new BigDecimal(average.toString()).divide(bigDecimal,2,BigDecimal.ROUND_HALF_UP).doubleValue()
        );

    }
}
