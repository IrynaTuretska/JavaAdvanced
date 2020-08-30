package ls20200826_Predicate_UnaryOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/*
Лист из слов, у имеющих четную длину - оставить только четные буквы, у имеющих нечетную - нечетные
 */
public class Main {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("12121212"); //even
        stringList.add("34343"); //odd
        stringList.add("5656565"); //odd
        stringList.add("78787878"); //even

        System.out.println(stringList);

        List<String> list1 = listHandler(stringList, new LengthEvenPredicate(), new EvenOperator());
        System.out.println("even: " + list1);
        List<String> list2 = listHandler(stringList, new LengthOddPredicate(), new OddOperator());
        System.out.println("odd: " + list2);

    }

    public static List<String> listHandler(List<String> list,
                                           Predicate<String> predicate,
                                           UnaryOperator<String> operator) {
        List<String> resList = new ArrayList<>(); //create new list
        for (String s : list) {
            if (predicate.test(s)) {
                resList.add(operator.apply(s));
            }
        }
        return resList;
    }
}
