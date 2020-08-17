package hw_arrays_removeTest;

public class Test3 {
    private int[] array;

    public Test3(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void removeThirdTry(int index) {
        if (index >= 0 && index <= array.length) {
            int[] result = new int[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != index) {
                    result[j] = array[i];
                    j++;
                }
            }
            array = result;
        }
    }
}
