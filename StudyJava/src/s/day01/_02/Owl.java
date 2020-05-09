package s.day01._02;



public class Owl extends Bird{
    private  String name;

    public Owl(int age, boolean sex, String wing, String name) {
        super(age, sex, wing);
        this.name = name;
    }
}
