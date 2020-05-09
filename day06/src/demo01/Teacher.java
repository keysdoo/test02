package demo01;


public class Teacher extends Person {

    public Teacher() {
    }

    public Teacher(int id, String name, String sex, String birthday, int age) {
        super(id, name, sex, birthday, age);
    }

    @Override
    public String type() {
        return "教师";
    }

    @Override
    public String work() {
        return "教Java";
    }
}
