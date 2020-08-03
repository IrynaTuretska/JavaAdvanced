package hw_byteArray_3107;

/**
 * JavaAdvanced 31.07.2020
 */
public class WordBites {
    private byte sum;
    private byte quantity;

    public WordBites(byte sum, byte quantity) {
        this.sum = sum;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "WordBites{" + " sum = " + sum + ", quantity = " + quantity + '}';
    }
}
