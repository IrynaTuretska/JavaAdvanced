package ls20200909_BankAccount_hw20;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Parser {
    public static Account[] parseStringToAccounts(String[] array, Function<String, Account> function) {
        Account[] temp = null;
        Account[] result = null;
        if (array != null && function != null) {
            temp = new Account[array.length]; //если array = null, вызовет ошибку NullPointerException
            int index = 0;
            for (String element : array) {
                Account account = function.apply(element); //реализация apply в FunctionParserString
                if (account != null) {
                    temp[index++] = account;
                }
            }
            result = new Account[index];
            //если не все ячейки заполнены (пришел null), обрезаем, чтобы избежать null в результирующем массиве
            //копируем массив сам в себя, только начальную часть, по размеру меньше чем старый массив
            //массив-источник, с какой позиции, массив - куда, в какую позицию, сколько элементов
            System.arraycopy(temp, 0, result, 0, index);
        }
        return result;
    }

    public static Account[] parseStringToList(String[] array, Function<String, Account> function) {
        List<Account> temp = new ArrayList<>();
        Account[] res = null;
        if (array != null && function != null) {
            for (String element : array) {
                Account account = function.apply(element);
                if (account != null) {
                    temp.add(account);
                }
            }
            res = new Account[temp.size()];
            temp.toArray(res);
        }
        return res;
    }
}
