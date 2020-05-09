package s;

public class Father extends GrandFather{

  private String name="爷爷";
  private int age=76;
 String habit="钓鱼";

    public Father() {
        System.out.println("调用了爷爷类的无参构造");
    }

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("调用了爷爷类的有参构造");


    }
}
