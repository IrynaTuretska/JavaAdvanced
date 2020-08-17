package hw_arrays_removeTest;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        String[] arr = {"a1", "b2", "c3", "d4", "f5"};

        System.out.println("Base array: " + Arrays.toString(arr));

        Test2 test2 = new Test2(arr);
        test2.remove(2);
        System.out.println("New array: " + Arrays.toString(test2.getArray()));
        test2.remove(1);
        System.out.println("New array: " + Arrays.toString(test2.getArray()));
    }
}
