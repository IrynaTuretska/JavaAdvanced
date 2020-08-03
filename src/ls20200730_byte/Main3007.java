package ls20200730_byte;

import java.util.Arrays;

/**
 * JavaAdvanced 30.07.2020
 */
public class Main3007 {
    public static void main(String[] args) {
        byte[] bites = {-2,1, 2, 3, -1, 2, 1, 4, 1, 2, 1, -7,-8, 1,-9,-4};

        System.out.println("Количество слов в новом массиве: " + wordCounter(bites));

        Word[] words = getWords(bites);
        System.out.println(Arrays.toString(words));

    }

    public static Word[] getWords(byte[] array) {
        Word[] words = new Word[wordCounter(array)];
        int wordSum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (wordSum > 0) {
                    words[count] = new Word(wordSum); //создаем новый объект
                    wordSum = 0;
                    count++;
                }
            } else {
                wordSum += array[i]; //увеличиваем сумму на каждом шаге
            }
        }
        if (wordSum > 0) {
            words[count] = new Word(wordSum);
        }
        return words;
    }

    public static int wordCounter(byte[] array) {
        int wordCount = 0; //подсчет количества блоков между отрицательными числами
        int wordLength = 0; //подсчет положительных элементов - длина слова
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) { //нашли отрицательный элемент
                if (wordLength > 0) { //проверили, что символы накопились в слово
                    wordCount++;
                    wordLength = 0; //Обнуление для подготовки к следующему слову
                }
            } else {
                wordLength++; //если встретили положительное число - увеличиваем длину слова
            }
        }
        if (wordLength > 0) {
            wordCount++;
        }
        return wordCount;
    }
}
