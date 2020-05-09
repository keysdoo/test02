package s.day01._04;

public class Employees extends Personnel{
    @Override
    public void action(String notice) {
        System.out.println("通知：");
        System.out.println(notice);
        System.out.println("\t\t\t\t\t\t\t\t\t必胜环球科技有限公司");

    }

    public Employees(int id, int age, String name) {
        super(id, age, name);
    }
}
