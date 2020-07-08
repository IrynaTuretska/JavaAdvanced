package hw17_temperature;

/**
 * JavaAdvanced 07.07.2020
 */
public class SeasonTemperature {
    public static void main(String[] args) {
        /*
        Дан массив int, кратный 4 - средняя температура каждого сезона года.
        Преобразовать его в массив из объектов, каждый из которых имеет 4 поля по временам года,
        длина нового массива тоже кратна 4
         */

        int[] temperature = {-3, 18, 29, 13, 0, 16, 27, 10, -6, 10, 25, 7};
        Year[] years = new Year[temperature.length / 4]; //новый массив

        int index = 0; //индекс для нового массива объектов

        for (int i = 0; i < temperature.length - 3; i += 4) {
            //в каждом цикле создается новый объект из четырех элементов
            years[index++] = new Year(temperature[i], temperature[i + 1],
                    temperature[i + 2], temperature[i + 3]);
            //index++;
        }

        for (Year year : years) {
            System.out.println(year.toString());
        }
    }
}
