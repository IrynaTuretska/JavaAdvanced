package ls20200706_geometry;

/**
 * JavaAdvanced 07.07.2020
 */
public class Triangle extends Shape {
    private double side1 = 5.0;
    private double side2 = 7.0;
    private double base = 10.0;

    @Override
    public double getPI() {
        return 0;
    }

    @Override
    public double getRadius() {
        return 0;
    }

    @Override
    public double getSide1() {
        return side1;
    }

    @Override
    public double getSide2() {
        return side2;
    }

    @Override
    public double getBase() {
        return base;
    }


}
