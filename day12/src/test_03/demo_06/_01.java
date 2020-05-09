package test_03.demo_06;

public class _01 {
    public static void main(String[] args) {
Servers servers=new Servers();
for (int i=1;i<=10;i++){
  new Thread(new Visitor(servers),"游客"+i).start();




}
    }
}
