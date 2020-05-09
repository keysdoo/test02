package test_05;
public class _01 {

    public static void main(String[] args) {


        MyThread t = new MyThread();
        t.start();


        while (true) {
            if (MyThread.a == 1) {
                System.out.println("主线程读到了a = 1");
            }
        }
    }
}

