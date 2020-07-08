package ls20200707_geometry;

import java.util.Objects;

/**
 * JavaAdvanced 07.07.2020
 */
public class Square extends Shape {
    private double side;
    private double area; //инициализация здесь - до конструктора, в расчет не попадает.
    // Сначала отрабатываются свойства, потом методы - иерархия. Если инициализация не прописана, она по умолчанию

    public Square(double side) {//конструктор
        this.side = side;
        this.area = side * side;
    }

    public double area() {//метод расчета площади
        return area;
    }

    public String toString() {//метод для вывода на печать
        return "Square: side = " + side + ", area = " + area();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0 &&
                Double.compare(square.area, area) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side, area);
    }
}
