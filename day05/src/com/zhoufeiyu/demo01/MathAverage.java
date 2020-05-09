package com.zhoufeiyu.demo01;

import java.math.BigDecimal;
import java.util.ArrayList;

public class MathAverage {
    public static Double average(ArrayList<Student> arr ){


        double sum=0;

        for (Student n:arr
        ) {
            Double temp=sum;
            Double temp1=n.getGrade();

            sum=new BigDecimal(temp.toString()).add(new BigDecimal(temp1.toString())).doubleValue();

        }
        Double average=sum;
        Integer size=arr.size();
        BigDecimal bigDecimal = new BigDecimal(size.toString());
       return new BigDecimal(average.toString()).divide(bigDecimal,2,BigDecimal.ROUND_HALF_UP).doubleValue();

    }
}
