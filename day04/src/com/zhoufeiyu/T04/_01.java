package com.zhoufeiyu.T04;

import java.util.Calendar;

public class _01 {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        System.out.println("年\t:"+calendar.get(Calendar.YEAR));
        System.out.println("月\t:"+(calendar.get(Calendar.MONTH)+1));
        System.out.println("日\t:"+calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("小时:"+calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("分\t:"+calendar.get(Calendar.MINUTE));
        System.out.println("秒\t:"+calendar.get(Calendar.SECOND));
    }


}
