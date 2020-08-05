package ls20200804_Interface;

/**
 * JavaAdvanced 04.08.2020
 */
public class Main_0804 {
    public static void main(String[] args) {

        Canon5400 p1 = new Canon5400();
        Canon5400 p2 = new Canon5400();
        Xerox8211 p3 = new Xerox8211();

        //p3.print("hello");

        printString("hello again", p3);
    }

    public static void printString(String s, Printer p) {
        p.print(s);
    }

}
