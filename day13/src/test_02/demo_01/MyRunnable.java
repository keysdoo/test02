package test_02.demo_01;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        synchronized ("A"){
            System.out.println("开始了,需要A");
            synchronized ("B"){
                System.out.println("结束了,释放B");
            }
        }





    }
}
