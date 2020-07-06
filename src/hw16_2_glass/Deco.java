package hw16_2_glass;

/**
 * JavaAdvanced 06.07.2020
 */
public class Deco extends Glass {
    public int transparency; // в %
    public String place; //inside, outside
    public double weight;
    public boolean electric; //да, нет

    public Deco(String type, double price, int transparency, String place, double weight, boolean electric) {
        super(type, price);
        this.transparency = transparency;
        this.place = place;
        this.weight = weight;
        this.electric = electric;
    }
}
