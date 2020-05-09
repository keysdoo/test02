package s.day01._01;

public class Television extends Machine {
    private int screenSize;
    private double resolvingPower;

    public Television(String brand, String model, String color, double prices, int screenSize, double resolvingPower) {
        super(brand, model, color, prices);
        this.screenSize = screenSize;
        this.resolvingPower = resolvingPower;
    }


}
