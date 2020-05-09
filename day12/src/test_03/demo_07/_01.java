package test_03.demo_07;



import java.util.concurrent.Exchanger;

public class _01 {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<String>();
        new Thread(new ThreadA(exchanger),"A").start();
        new Thread(new ThreadB(exchanger),"B").start();
    }
}
