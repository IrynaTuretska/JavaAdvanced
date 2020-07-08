package ls20200707_geometry;

/**
 * JavaAdvanced 07.07.2020
 */
public class Main_0707 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);
        Square s1 = new Square(5);
        Square s2 = new Square(5);
        Rectangle r1 = new Rectangle(4, 8);
        Rectangle r2 = new Rectangle(5, 3);

        Shape[] shapes = new Shape[]{c1, c2, s1, s2, r1, r2,
                new Rectangle(10, 3), new Square(18)}; //создаем массив из фигур

        System.out.println("----- " + s1.equals(s2)); //без переопределения сравниваются адреса объектов в памяти
        //с переопределением - сравниваются поля

        for (Shape shape : shapes) {//ссылается на родителя!
            System.out.println(shape.toString());
            //System.out.println(shape.area());
        }
    }
}
