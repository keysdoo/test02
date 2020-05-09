package s.day01._02;

public class Reptiles extends Animals{

    private  String egg;

    public Reptiles(int age, boolean sex, String egg) {
        super(age, sex);
        this.egg = egg;
    }

    public void LayEggs(){
        System.out.println("产卵");
    }
}
