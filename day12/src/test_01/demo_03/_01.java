package test_01.demo_03;

public class _01 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(ticket,"窗口一").start();
        new Thread(ticket,"窗口二").start();
        new Thread(ticket,"窗口三").start();

    }
}
