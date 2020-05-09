package test_03;

public class _01 {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.setAge(20);
        } catch (AgeException e) {
            System.out.println("年龄错误。");
        }
        try {
            student.setAge(10);
        } catch (AgeException e) {

            System.out.println("年龄错误。");
        }

        try {
            student.setSex('女');
        }catch (SexException e){
            System.out.println("性别错误。");
        }
        try {
            student.setSex('n');
        }catch (SexException e){
            System.out.println("性别错误。");
        }
        System.out.println(student.getAge());
        System.out.println(student.getSex());


    }
}
