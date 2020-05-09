package test_01.demo_01;

public class MyThread extends Thread {


    @Override
    public void run() {
      for (int i=1;i<=1000;i++){
          System.out.println("i:"+i);
      }
    }
}
