package test_03;

public class Student {
    private String name;
    private int age;
    private char sex;

    public Student(String name, int age, char sex) {
        this.name = name;

        if (age>50||age<15){
            throw new AgeException();
        }else {
            this.age = age;
        }

        if (sex!='男'&&sex!='女'){
            throw new  SexException();
        }else {
            this.sex = sex;
        }


    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age>50||age<15){
            throw new AgeException("年龄异常");
        }else {
            this.age = age;
        }
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {

        if (sex!='男'&&sex!='女'){
            throw new  SexException("性别异常");
        }else {
            this.sex = sex;
        }

    }
}
