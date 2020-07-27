package holidaysExercises;

/**
 * JavaAdvanced 23.07.2020
 */
public class Strings {
    public static void main(String[] args) {

        //2-05
        System.out.println(prefixAgain("abXYabc", 1)); //true
        System.out.println(prefixAgain("abXYabc", 2)); //true
        System.out.println(prefixAgain("abXYabc", 3)); //false

        //2-04
//        System.out.println(repeatEnd("Hello", 3)); //llollollo
//        System.out.println(repeatEnd("Hello", 2)); //lolo
//        System.out.println(repeatEnd("Hello", 1)); //o

        //2-03
//        System.out.println(bobThere("abcbob")); //true
//        System.out.println(bobThere("b9b")); //true
//        System.out.println(bobThere("bac")); //false

        //2-02
//        System.out.println(countCode("aaacodebbb")); //->1
//        System.out.println(countCode("codexxcode")); //->2
//        System.out.println(countCode("cozexxcope")); //->2

        //2-01
        //System.out.println(doubleChar("Three"));
    }

    private static boolean prefixAgain(String str, int n) {
        //2-05 Given a string, consider the prefix string made of the first N chars of the string.
        // Does that prefix string appear somewhere else in the string?
        // Assume that the string is not empty and that N is in the range 1..str.length().
        String toCheck = str.substring(0, n);
        for (int i = n; i < str.length(); i++) {
            if (n + i <= str.length()) {
                if (toCheck.equals(str.substring(i, n + i)))
                    return true;
            }
        }
        return false;
    }

    private static String repeatEnd(String str, int n) {
        //2-04 Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
        // You may assume that n is between 0 and the length of the string, inclusive.
        String result = "";
        for (int i = 1; i <= n; i++) {
            result = result.concat(str.substring(str.length() - n));
        }
        return result;
    }

    private static boolean bobThere(String str) {
        //2-03 Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
        String toCheck = "bob";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == toCheck.charAt(0) && str.charAt(i + 2) == toCheck.charAt(2)) {
                return true;
            }
        }
        return false;
    }

    private static int countCode(String str) {
        //2-02 Return the number of times that the string "code" appears anywhere in the given string,
        // except we'll accept any letter for the 'd', so "cope" and "cooe" count.
        int result = 0;
        String toCheck = "code";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == toCheck.charAt(0) && str.charAt(i + 1) == toCheck.charAt(1)
                    && str.charAt(i + 3) == toCheck.charAt(3)) {
                result++;
            }
        }
        return result;
    }

    private static String doubleChar(String str) {
        //2-01  Given a string, return a string where for every char in the original, there are two chars
        //("The") → "TThhee"
        String result = "";
        for (int i = 0; i < str.length() - 1; i++) {
            result += str.charAt(i);
            result += str.charAt(i);
        }
        return result;
    }
}
