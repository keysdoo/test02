package test_01.demo_03;

public class Ticket implements Runnable {
    int ticket=100;
    @Override
    public void run() {

            myticket();

    }

    private synchronized void myticket() {

        while (true){
            if (ticket<1){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"卖出了第"+ticket+
                    "张票");
            ticket--;
        }


    }
}
