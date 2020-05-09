package s;

public class Sun extends Father{
private String name="儿子";
private int age=25;

    public Sun() {
        System.out.println("调用了儿子类的无参构造");
    }

    public Sun(String name, int age, String name1, int age1) {
        super(name1, age1);
        this.name = name;
        this.age = age;
        System.out.println("调用了儿子类的有参构造");
    }

    @Override
    void sa() {
        System.out.println("输出儿子的年龄："+age);
    }
}
