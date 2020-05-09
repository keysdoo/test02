package test_03.demo_06;

public class Visitor implements Runnable {
    private Servers servers;

    public Visitor(Servers servers) {
        this.servers = servers;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+"进展览室");
        System.out.println(Thread.currentThread().getName()+"参观展览室....");
        System.out.println(Thread.currentThread().getName()+"出展览室");

    }
}
