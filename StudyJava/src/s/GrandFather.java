package s;

public class GrandFather{
private String name="爸爸";
private int age=50;


    public GrandFather() {
        System.out.println("调用了爸爸类的无参构造");
    }

    public GrandFather(String name, int age) {
        System.out.println("调用了爸爸类的有参构造");
    }
    void sc( ){
        System.out.println("输出姓名："+name);

    }

    void sa(){
        System.out.println("输出年龄："+age);

    }


}
