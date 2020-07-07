package ls20200706_geometry;

/**
 * JavaAdvanced 06.07.2020
 */
public class Square extends Shape {
    private double side1 = 5.0;
    private double side2 = 5.0;

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
        return 0;
    }
}
