package test_01.demo_02;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i=1;i<=1000;i++){
            System.out.println("i:" +i
                    );
        }
    }
}
