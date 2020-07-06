package hw16_2_glass;

/**
 * JavaAdvanced 06.07.2020
 */
abstract class Window extends Glass{

    private String transparency;
    private double thickness;
    private int safety; //допустим, какой-то коэффициент безопасности - 1,2,3
    private int layer; //сколько слоев
    private int heatResistance;

    public Window(String type, double price, String transparency, double thickness,
                  int safety, int layer, int heatResistance) {
        super(type, price);
        this.transparency = transparency;
        this.thickness = thickness;
        this.safety = safety;
        this.layer = layer;
        this.heatResistance = heatResistance;
    }


    public String getTransparency() {
        return transparency;
    }

    public double getThickness() {
        return thickness;
    }

    public int getSafety() {
        return safety;
    }

    public int getLayer() {
        return layer;
    }

    public int getHeatResistance() {
        return heatResistance;
    }
}
