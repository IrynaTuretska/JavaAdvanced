package ls20200706_geometry;

/**
 * JavaAdvanced 06.07.2020
 */
abstract class Shape {
    public Shape() {
    }

    public abstract double getPI();

    public abstract double getRadius();

    public abstract double getSide1();

    public abstract double getSide2();

    public abstract double getBase();


    protected void findSquareArea() {
        System.out.println("Square area: "
                + (getSide1() * getSide2()));
    }

    protected void findCircleArea() {
        System.out.println("Circle area: " + (getPI() * getRadius() * getRadius()));
    }

    protected void findTriangleArea() {
        double high = Math.sqrt(getSide1() * getSide2() - getBase() * getBase() / 4); // расчет высоты треугольника
        double areaTriangle = (getBase() * high) / 2;
        System.out.println("Triangle area: " + areaTriangle);
    }
}
