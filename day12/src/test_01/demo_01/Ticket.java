package test_01.demo_01;

public class Ticket implements Runnable {
    int ticket=100;
    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName()+"卖出了第"+ticket+
                    "张票");
            ticket--;
           if (ticket<1){
               break;
           }

        }
    }
}
