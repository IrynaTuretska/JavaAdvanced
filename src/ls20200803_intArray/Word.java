package ls20200803_intArray;

import java.util.Arrays;

/**
 * JavaAdvanced 31.07.2020
 */
public class Word {
    private int[] securedWord;
    private int sum;

    public Word(int[] securedWord, int sum) {
        this.securedWord = securedWord;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Word {" + "securedWord " + Arrays.toString(securedWord) + ", sum: " + sum + '}';
    }
}
