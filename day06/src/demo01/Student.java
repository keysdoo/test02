package demo01;


public class Student extends Person {

    public Student() {

    }

    public Student(int id, String name, String sex, String birthday, int age) {
        super(id, name, sex, birthday, age);
    }

    @Override
    public String type() {
        return "学生";
    }

    @Override
    public String work() {
        return "学习Java";
    }
}
