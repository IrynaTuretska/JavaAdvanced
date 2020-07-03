package ls20200630_employee;

import java.util.Arrays;

/**
 * JavaAdvanced 30.06.2020
 */
public class MergeTest {
    public static void main(String[] args) {
        mergeTry();
    }

    public static void mergeTry() {
        int[] array = {5, 8, 3, 4, 9, 6, 32, 1, 7, 12, 0, 87};
        int[] arrayRes = new int[array.length];
//разбивка на два подмассива
        int from = 0;
        int to = array.length;
        int mid = (to - from) / 2;

        int[] arr1 = Arrays.copyOfRange(array, from, mid);
        int[] arr2 = Arrays.copyOfRange(array, mid, to);

        System.out.println("a1: " + Arrays.toString(arr1));
        System.out.println("a2: " + Arrays.toString(arr2));
//объединение в новый массив
        int x1 = 0;
        int x2 = 0;
        int i = from;
        while (x1 < arr1.length && x2 < arr2.length) {
            if (arr1[x1] < arr2[x2]) {
                arrayRes[i] = arr1[x1++];
            } else {
                arrayRes[i] = arr2[x2++];
            }
            i++;
        }
        while (x1 < arr1.length) {
            arrayRes[i] = arr1[x1];
            x1++;
            i++;
        }
        while (x2 < arr2.length) {
            arrayRes[i] = arr2[x2];
            x2++;
            i++;
        }
        System.out.println("ArrayRes: " + Arrays.toString(arrayRes));
    }
}
