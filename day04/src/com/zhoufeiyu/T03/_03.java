package com.zhoufeiyu.T03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _03 {
    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println(simpleDateFormat.format(date));


    }
}
