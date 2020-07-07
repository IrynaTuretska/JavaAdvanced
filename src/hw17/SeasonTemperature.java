package hw17;

import java.util.Arrays;

/**
 * JavaAdvanced 07.07.2020
 */
public class SeasonTemperature {
    public static void main(String[] args) {
        /*
        Дан массив int, кратный 4 - средняя температура каждого сезона года.
        Преобразовать его в массив из объектов, каждый из которых имеет 4 поля по временам года,
        длина нового массива тоже кратна 4

      не сделано
         */

        int[] temperature = {-3, 18, 29, 13, 0, 16, 27, 10, -6, 10, 25, 7};
        Year[] years = new Year[temperature.length / 4]; //новый массив


        for (int i = 0; i <= temperature.length - 1; i = i + 4) {
            int[] arr1 = Arrays.copyOfRange(temperature, i, (i + 4));
            years[i] = new Year(arr1);

            System.out.println(Arrays.toString(arr1));
        }

        for (Year year : years) {
            System.out.println(year.toString());
        }
    }
}
