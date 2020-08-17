package ls20200813;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //задача - удалить элемент из середины массива

        String[] arr = {"a", "b", "c", "d", "e"};

        ArrayHandler arrayHandler = new ArrayHandler(arr);
        System.out.println(Arrays.toString(arrayHandler.getArray()));
        System.out.println("--------------");
        arrayHandler.remove3(3);
        System.out.println(Arrays.toString(arrayHandler.getArray()));
    }
}
