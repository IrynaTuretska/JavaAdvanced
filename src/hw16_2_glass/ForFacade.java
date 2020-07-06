package hw16_2_glass;

/**
 * JavaAdvanced 06.07.2020
 */
public class ForFacade extends Window {
    public ForFacade(String type, double price, String transparency, double thickness,
                     int safety, int layer, int heatResistance) {
        super(type, price, transparency, thickness, safety, layer, heatResistance);
    }
}
