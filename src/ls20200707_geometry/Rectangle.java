package ls20200707_geometry;

/**
 * JavaAdvanced 07.07.2020
 */
public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double area() {
        return sideA * sideB;
    }

    public String toString() {
        return "Rectangle: sides = " + sideA + " and " + sideB + ", area = " + area();
    }
}
