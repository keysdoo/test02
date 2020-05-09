package s.day01._03;

public class Sportsman extends Personnel {
   private int studyClass;

    public Sportsman(String name, boolean sex, int id, int age, int studyClass) {
        super(name, sex, id, age);
        this.studyClass = studyClass;
    }

    @Override
    public void action() {
        System.out.println("吃饭(吃营养餐)");
    }
}
