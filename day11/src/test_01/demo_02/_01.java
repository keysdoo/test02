package test_01.demo_02;

public class _01 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

      Thread t=new Thread(myRunnable);
      t.start();
        for (int k=1;k<=1000;k++){
            System.out.println("k:"+k);
        }



    }
}
