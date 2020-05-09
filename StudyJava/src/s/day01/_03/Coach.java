package s.day01._03;

public class Coach extends Personnel {
    public Coach(String name, boolean sex, int id, int age) {
        super(name, sex, id, age);

    }

    @Override
    public void action() {
        System.out.println("吃饭(吃工作餐)");
    }


}
