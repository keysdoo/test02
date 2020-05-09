package com.zhoufeiyu.T02;

public interface GPS {
  public  void   gps();
  public  static final int a=10;
    public  static void a(){
      System.out.println("aaaaaa");
  }
  default   void b(){
    System.out.println("bbbbbb");
  }


  private  void c(){
    System.out.println("cccccc");
  }
}
