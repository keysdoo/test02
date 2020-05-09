package s.day01._04;

public abstract class Personnel {
    private int id;
    private int age;
    private String name;
    public abstract void action(String notice);

    public Personnel(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}
