package s.day01._02;

public class Mammals extends Animals {

    private String milk;

    public Mammals(int age, boolean sex, String milk) {
        super(age, sex);
        this.milk = milk;
    }
    public void eatMilk(){
        System.out.println("吃奶！");
    }


}
