package s.day01._02;

public class Bird extends  Animals {
private String  Wing;
public  void fly(){
    System.out.println("在天上飞！");
}

    public Bird(int age, boolean sex, String wing) {
        super(age, sex);
        Wing = wing;
    }
}
