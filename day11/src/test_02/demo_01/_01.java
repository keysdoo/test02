package test_02.demo_01;

public class _01 {
    public static void main(String[] args) {
       Thread t=new Thread(){
           @Override
           public void run() {
                int sum=0;
                for (int i=1;i<=100;i++){
                    sum=sum+i;
                    System.out.println("sum:"+sum);
                }
           }
       };
       t.start();

    }
}
