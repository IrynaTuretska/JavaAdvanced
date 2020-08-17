package ls20200813;

public class ArrayHandler {
    private String[] array;

    public ArrayHandler(String[] array) {
        this.array = array;
    }

    public String[] getArray() {
        return array;
    }

    //создание нового массива без удаленного элемента перебором
    public void remove(int index) { //принимает индекс элемента, который надо удалить
        String[] res;
        if ((index >= 0) && (index < array.length)) {// проверяем находится ли полученный индекс в массиве
            res = new String[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) { //i - счетчик по исходному массиву, j - по новому
                if (i != index) {
                    res[j] = array[i]; //присваиваем элементу j массива res значение элемента i массива array
                    j++;
                }
            }
            array = res; //замена исходного массива новым
        }
    }

    public void remove2(int index) { //копирование массива в новый по частям
        String[] res;
        if ((index >= 0) && (index < array.length)) {
            res = new String[array.length - 1];
            if (index > 0) {//копирование части массива до индекса
                //откуда - исходный массив, начиная с какого элемента, куда, начиная с какого, сколько элементов берем
                System.arraycopy(array, 0, res, 0, index);
            }
            if (index < array.length - 1) {//копирование части массива после индекса
                System.arraycopy(array, index + 1, res, index, array.length - 1 - index);
            }
            array = res;
        }
    }

    //[1][2][3][4][5] -> [1][2][4][5][5] требует знания размера массива (size)
    public void remove3(int index) { // копирование массива в самого себя
        if ((index >= 0) && (index < array.length)) {
            System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
        }
    }
}
