package test_02.demo_01;

public class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        synchronized ("B"){
            System.out.println("开始了,需要B");
            synchronized ("A"){
                System.out.println("结束了,释放A");
            }
        }

    }
}
