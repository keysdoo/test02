package test_01.demo_04;

public class _01 {
    public static void main(String[] args) throws InterruptedException {

        int sum=0;

        MyThread myThread = new MyThread("子线程");
        myThread.start();
        for (int k=1;k<=100;k++){
            sum=sum+k;
            System.out.println("主线程,sum:"+sum);
        }



    }
}
