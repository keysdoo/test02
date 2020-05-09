package s.day01._03;



public abstract class Personnel {
    private   String name;
    private   boolean sex;
    private    int  id;
    private    int age;

    public Personnel(String name, boolean sex, int id, int age) {
        this.name = name;
        this.sex = sex;
        this.id = id;
        this.age = age;
    }

    public  abstract void action();
}
