package s.day01._02;

public class Parrot extends Bird {
    private  String name;

    public Parrot(int age, boolean sex, String wing, String name) {
        super(age, sex, wing);
        this.name = name;
    }
}
