package test_04.demo_01;

public class MyThread extends Thread {
    static int a=0;
    @Override
    public void run() {

        System.out.println("线程启动,休息两秒");
        try {
            Thread.sleep(1000*2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("将a改成1");
        a=1;
        System.out.println("线程结束");
    }

}
