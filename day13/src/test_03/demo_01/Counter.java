package test_03.demo_01;

public class Counter implements Runnable {


    private  int i=0;

    @Override
    public void run() {
     synchronized ("1"){


         while (TraversingNum.num<1000){

             i++;
             System.out.println("能同时被2,3,5,7整除有"+i+"个");

            "1".notify();
             try {
                 "1".wait();
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }


     }

    }


    public int getI() {
        return i;
    }
}
