package ls20200803_intArray;

/**
 * JavaAdvanced 31.07.2020
 */
public class Main0803 {
    public static void main(String[] args) {
        //проверить корректность массива, после минусового значения (признак окончания) идет сумма и количество,
        // разбить на отдельные массивы
        //количество отрицательных элементов равно количеству слов
        int[] array = {1, 2, 3, -1, 6, 3,
                2, 3, -2,4, 5, -2, 14, 4,
                3, 4, 5, 6, 7, -3, 25, 5,
                12, 2, 3, -4, 17, 3};

        Parser parser = new Parser(array);
        System.out.println(parser);
    }

}
