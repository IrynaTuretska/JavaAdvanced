package holidaysExercises;

/**
 * JavaAdvanced 27.07.2020
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {200, 184, -18, 55, 49, 2, 65, -14, 0};

        System.out.println("Not sorted: "); //для распечатки исходного массива
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();

        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= i; j--) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println("Sorted: "); // распечатка результата
        for (int j = 0; j < arr.length; j++) {
            System.out.print(" " + arr[j]);
        }
    }
}
