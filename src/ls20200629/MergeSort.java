package ls20200629;

import java.util.Arrays;

/**
 * JavaAdvanced 29.06.2020
 */

//рекурсивная сортировка, слияние двух массивов

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = getArray(20, 0, 30);
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("Array is sorted: " + isArraySort(arr));
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        sort(arr, 0, arr.length); //три параметра указывают на второй метод sort
    }

    private static void sort(int[] arr, int from, int to) {//работает с кусочком массива, который мы задали
        //if (to > from) {// проверяем, что на входе, имеет ли смысл сортировка

        //метод на каждом шаге дробит массив пополам, и каждый из них отдельно сортирует вызывая самого себя,
        // пока не доходит до единичного элемента, который по определению сортирован
        // и после этого соединяет - merge
        int middle = (from + to) / 2; //середина куска массива
        sort(arr, from, middle); //left part
        sort(arr, middle, to); //right part

        merge(arr, from, middle, to);
    }

    //from - start index for the first range [from ... middle-1]
    //middle - start index for the second range [middle ... to]
    //
    private static void merge(int[] arr, int from, int middle, int to) {//Объединяем результат
        int[] arr1 = Arrays.copyOfRange(arr, from, middle); //создание копии массива диапазона из исходного
        int[] arr2 = Arrays.copyOfRange(arr, middle, to);

        int x1 = 0, x2 = 0; //стартовые индексы в подмассивах
        int i = from; //стартовый индекс в результирующем массиве
        while (x1 < arr1.length && x2 < arr2.length) {
//            if (arr1[x1] < arr2[x2]) {
//                arr[i] = arr1[x1++];//сдвиг индекса внутри!!
//            } else {
//                arr[i] = arr2[x2++];
//            }
//            i++;
            arr[i++] = (arr1[x1] < arr2[x2]) ? arr1[x1++] : arr2[x2++];
        }
        // выполняется один из этих двух циклов, если один из подмассивов закончился, переброска оставшихся элементов
        while (x1 < arr1.length) {
            arr[i++] = arr1[x1++];
        }
        while (x2 < arr2.length) {
            arr[i++] = arr2[x2++];
        }
    }


    public static int[] getArray(int size, int min, int max) {//заполнение массива
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min); //+1 для "захвата" максимального элемента
        }
        return arr;
    }

    public static boolean isArraySort(int[] arr) {//тестовый метод, проверка результата
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
