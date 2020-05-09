package test_01.demo_01;

public class _01 {
    public static void main(String[] args) {
        new Thread(()->{
            for (int i=1;i<=100;i++){
                System.out.println(i);
            }
        }).start();

    }
}
