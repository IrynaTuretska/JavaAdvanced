package holidaysExercises;

/**
 * JavaAdvanced 22.07.2020
 */
public class Loops {
    public static void main(String[] args) {

        //System.out.println(writeBack(1234));
        //System.out.println(findSumDigits(1234));
        //makeTriangle();
        //makeTriangle2();
        //findDigits(99999, 11);
        //checkOddEven(89561);
        //multiplicationTable();
        //evenSeven();
        System.out.println(palindrome("klonspsnolk"));
        System.out.println(palindrome("123654"));
        System.out.println(palindrome("123454321"));
    }

    private static boolean palindrome(String forCheck) {
        for (int i = 0; i < forCheck.length() - 1; i++) {
            for (int j = forCheck.length() - 1; j > i; j--) {
                if (forCheck.charAt(i) == forCheck.charAt(j)) {
                    return true;
                } else return false;
            }
        }
        return false;
    }

    private static void evenSeven() {
        for (int i = 0; i < 100; i++) {
            if (i % 7 == 0)
                System.out.print(i + " ");
        }
    }

    private static void multiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4s", (i * j));
            }
            System.out.println();
        }
    }

    private static void checkOddEven(int number) {
        //Дано целое число. Написать метод, который определит чётность/ нечётность разрядов этого числа:
        String temp = String.valueOf(number);
        for (int i = 1; i <= temp.length(); i++) {
            int a = number % 10; //последний символ - остаток от деления на 10
            number = number / 10; //уменьшение исходного числа в 10 раз
            if (a % 2 == 0) {
                System.out.println(a + " is even");
            } else System.out.println(a + " is odd");
        }
    }

    private static void findDigits(int range, int n) {
        //Найдите в заданном диапазоне хотя бы одно натуральное число, которое делится на 11,
        // а при делении на 2, 3, 4, ..., 10 дает в остатке 1.
        for (int i = 0; i <= range; i += n) {
            if (i % 2 == 1 && i % 3 == 1 && i % 4 == 1 && i % 5 == 1 && i % 6 == 1
                    && i % 7 == 1 && i % 8 == 1 && i % 9 == 1 && i % 10 == 1)
                System.out.print(i + ", ");
        }
    }

    private static void makeTriangle2() {
        int side = 5;

        for (int i = 0; i < side; i++) {
            for (int j = side; j > i; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = side; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = side; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = side; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void makeTriangle() {
        int a = 5;
        for (int i = 1; i <= a; i++) { //i -> row
            for (int j = 0; j < i; j++) { //j -> column
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = a - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static int findSumDigits(int digit) {
        //Написать метод, который возвращает сумму разрядов целого числа
        int result = 0;
        String temp = String.valueOf(digit);
        for (int i = 0; i <= temp.length(); i++) {
            result = result + digit % 10;
            digit = digit / 10;
            //System.out.println("Digit: " + digit);
        }
        return result;
    }

    public static String writeBack(int digit) {
        String result = "";
        String help = String.valueOf(digit);
        for (int i = 0; i < help.length(); i++) {
            result = help.charAt(i) + result;
        }
        return result;
    }

}
