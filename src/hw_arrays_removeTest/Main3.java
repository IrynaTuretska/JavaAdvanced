package hw_arrays_removeTest;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Base array: " + Arrays.toString(array));
        Test3 test = new Test3(array);

        test.removeThirdTry(4);
        System.out.println("Remove 1: " + Arrays.toString(test.getArray()));

        test.removeThirdTry(5);
        System.out.println("Remove 2: " + Arrays.toString(test.getArray()));
    }
}
