package test_02.demo_01;

public class _01 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        MyRunnable1 myRunnable1 = new MyRunnable1();
        new Thread(myRunnable).start();
        new Thread(myRunnable1).start();
    }
}
