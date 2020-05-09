package s.day01._01;

public class Refrigerator extends Machine{
    private  String doorStyle;
    private  String refrigerationMode;

    public Refrigerator(String brand, String model, String color, double prices, String doorStyle, String refrigerationMode) {
        super(brand, model, color, prices);
        this.doorStyle = doorStyle;
        this.refrigerationMode = refrigerationMode;
    }

}
