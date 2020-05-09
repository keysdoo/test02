package com.zhoufeiyu.TestFinal;

public interface A {
    public final static int a=10;
    public default   void b(){
        System.out.println("bbbbb");
        d();
    }

   public static  void c(){
        System.out.println("cccccc");

    }
    private void d (){

        System.out.println("ddddddd");
    }
       public abstract   void e();

}
