package test_01.demo_02;




public class Ticket implements Runnable {
    int ticket=100;


    @Override
    public void run() {

        while (true){


            synchronized (this) {

                if (ticket<1){
                    break;
                }


                System.out.println(Thread.currentThread().getName() + "卖出了第" + ticket-- +
                        "张票");
            }


        }
    }
}
