package ls20200710_compare;

/**
 * JavaAdvanced 10.07.2020
 */
public class Main_factorial {
    public static void main(String[] args) {
        //factorial 5! = 1*2*3*4*5 + рекурсия
        // 5! = 4!*5
        // 4! = 3!*4

        System.out.println(findFactorial(5));

    }

    public static int findFactorial(int a) {
        if (a <= 1) return 1;
        return a * findFactorial(a - 1);
    }

}
