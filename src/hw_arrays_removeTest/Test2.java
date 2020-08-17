package hw_arrays_removeTest;

public class Test2 {
    private String[] array;

    public Test2(String[] array) {
        this.array = array;
    }

    public String[] getArray() {
        return array;
    }

    public void remove(int index) {
        String[] result;
        if (index >= 0 && index <= array.length) {
            result = new String[array.length-1];
            for (int i = 0, j = 0; i < array.length ; i++) {
                if(i != index){
                    result[j] = array[i];
                    j++;
                }
            }
            array = result;
        }
    }
}
