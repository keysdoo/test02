package s.day01._01;

public class LaundryMachine extends Machine {
    private String motorType;
    private int washingCapacity;

    public LaundryMachine(String brand, String model, String color, double prices, String motorType, int washingCapacity) {
        super(brand, model, color, prices);
        this.motorType = motorType;
        this.washingCapacity = washingCapacity;
    }




}
