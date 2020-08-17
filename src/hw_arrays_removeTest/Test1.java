package hw_arrays_removeTest;

public class Test1 {
    private int[] array;

    public Test1(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void remove1(int index) {
        int[] resultArray = new int[array.length-1];
        if (index >= 0 && index < array.length) {
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != index) {
                    resultArray[j++] = array[i];
                }
            }
            array = resultArray;
        }
    }
}
