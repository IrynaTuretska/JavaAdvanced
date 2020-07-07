package ls20200706_geometry;

/**
 * JavaAdvanced 06.07.2020
 */
public class Circle extends Shape {
    private double PI = 3.14;
    private double radius = 5.0;

    public Circle() {
        super();
    }

    @Override
    public double getPI() {
        return PI;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public double getSide1() {
        return 0;
    }

    @Override
    public double getSide2() {
        return 0;
    }

    @Override
    public double getBase() {
        return 0;
    }
}
