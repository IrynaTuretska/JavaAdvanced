package hw16_2_glass;

/**
 * JavaAdvanced 06.07.2020
 */
public class Mirror extends Deco {
    private double high;
    private double width;
    private String frame; //наличие рамы


    public Mirror(String type, double price, int transparency, String place, double weight,
                  boolean electric, double high, double width, String frame) {
        super(type, price, transparency, place, weight, electric);
        this.high = high;
        this.width = width;
        this.frame = frame;
    }
}
