package ls20200706_geometry;

/**
 * JavaAdvanced 06.07.2020
 */
public class Main {
    public static void main(String[] args) {

        //Rectangle r1 = new Rectangle();
        Circle c1 = new Circle();
        Square s1 = new Square();
        Triangle t1 = new Triangle();

        //Shape[] shapes = new Shape[]{c1, s1, t1};

        c1.findCircleArea();
        s1.findSquareArea();
        t1.findTriangleArea();

    }
}
