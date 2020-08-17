package hw_arrays_removeTest;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Base array: " + Arrays.toString(array));

        Test1 arraysRemoveTest = new Test1(array);

        arraysRemoveTest.remove1(5);
        System.out.println("Changed array 1: " + Arrays.toString(arraysRemoveTest.getArray()));
        arraysRemoveTest.remove1(2);
        System.out.println("Changed array 2: " + Arrays.toString(arraysRemoveTest.getArray()));
        arraysRemoveTest.remove1(1);
        System.out.println("Changed array 3: " + Arrays.toString(arraysRemoveTest.getArray()));
    }
}
