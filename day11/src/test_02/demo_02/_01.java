package test_02.demo_02;

public class _01 {
    public static void main(String[] args) {


       Runnable r= new Runnable(){
            @Override
            public void run() {
                int sum=0;
                for (int i=1;i<=500;i++){
                    sum=sum+i;
                    System.out.println("sum:"+sum);
                }
            }
        };
      new Thread(r).start();

    }
}
