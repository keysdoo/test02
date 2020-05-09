package test_03.demo_01;

public class _01 {

    public static void main(String[] args) throws InterruptedException {

        Counter counter=new Counter();
        TraversingNum traversingNum=new TraversingNum();
   new Thread(traversingNum).start();
        Thread.sleep(1000);
        new Thread(counter).start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("1000内能同时被2,3,5,7整除有" +counter.getI()+
                "个");

    }



}
