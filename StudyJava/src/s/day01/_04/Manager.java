package s.day01._04;

public class Manager extends Personnel {

    private  int  yearEndBonus;


    public Manager(int id, int age, String name, int yearEndBonus) {
        super(id, age, name);
        this.yearEndBonus = yearEndBonus;
    }

    @Override
    public void action(String notice) {
        System.out.println("通知：");
        System.out.println(notice);
        System.out.println("\t\t\t\t\t\t\t\t\t必胜环球科技有限公司");

    }
}
