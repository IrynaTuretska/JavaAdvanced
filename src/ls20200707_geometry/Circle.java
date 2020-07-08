package ls20200707_geometry;

import java.util.Objects;

/**
 * JavaAdvanced 07.07.2020
 */
public class Circle extends Shape {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }

    public double area() {
        return area;
    }

    public String toString() {
        return "Circle: radius = " + radius + ", area = " + area();
    }

    @Override
    public boolean equals(Object o) {

        Circle circle = (Circle) o;
        return circle.radius == this.radius; //сравниваем те объекты, у которых радиусы равны - мы сами задаем правило
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, area);
    }
}
