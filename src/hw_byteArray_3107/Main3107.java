package hw_byteArray_3107;

import java.util.Arrays;

/**
 * JavaAdvanced 31.07.2020
 */
public class Main3107 {
    public static void main(String[] args) {
        byte[] bites = {1, 2, 3, -1, 6, 3,
                2, 3, 4, 5, -2, 14, 4,
                3, 4, 5, 6, 7, -3, 25, 5};

        System.out.println("Количество слов в массиве: " + countWordsInArray(bites));

        WordBites[] words = checkArray(bites);
        System.out.println(Arrays.toString(words));

    }

    public static WordBites[] checkArray(byte[] array) {
        WordBites[] words = new WordBites[countWordsInArray(array)];
        byte wordSum = 0; //сумма значений
        byte wordQty = 0; //сумма знаков
        byte count = 0; //счетчик

        //wordSum == array[i + 1] && wordQty == array[i + 2]

        for (byte i = 0; i < array.length; i++) {
            if (array[i] < 0) {//нашли минусовое значение
//                wordSum = array[i + 1]; //следующее за ним - сумма
//                wordQty = array[i + 2];//через одно - количество
                if (wordSum > 0) {
                    words[count] = new WordBites(wordSum, wordQty);
                    wordSum = 0;
                    wordQty = 0;
                    count++;
                }
            } else {
                wordSum += array[i];
                wordQty += i;
            }
        }
        if (wordSum > 0) {
            words[count] = new WordBites(wordSum, wordQty);
        }
        return words;
    }

    public static int countWordsInArray(byte[] array) {
        int countWords = 0; // количество блоков между отрицательными элементами
        int countLength = 0; // количество положительных элементов
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (countLength > 0) {
                    countWords++;
                    countLength = 0;
                }
            } else {
                countLength++;
            }
        }
        return countWords;
    }
}
