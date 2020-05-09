package test_01.demo_04;

public class MyThread extends Thread {
    @Override
    public void run() {
        int s=0;
       for (int i=1;i<=1000;i++){
          s=s+i;
           System.out.println(getName()+"sum:"+s);
       }
    }


    public MyThread(String name) {
        super(name);
    }
}
