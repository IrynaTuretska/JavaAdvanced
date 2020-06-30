public class Main {

    public static void main(String[] args) {
        method(4);

    }

    //задачка из контрольной 14
    private static int method(int temp) {
        System.out.println("start temp = " + temp);
        if (temp > 1) {
            method(temp / 2);
            method(temp / 4);
        }
        System.out.println("final temp = " + temp);
        return 1;
    }
}
