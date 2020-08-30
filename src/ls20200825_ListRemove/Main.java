package ls20200825_ListRemove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("str1");
        list.add("qstr2");
        list.add("qstr3");
        list.add("str4");
        list.add("qstr5");
        list.add("str6");
        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).startsWith("q")) {
//                list.remove(i);
//                i--; //сдвигаем индекс
//            }
//        }

        //Predicate<String> predicate = new ConditionForRemove(); => стандартный аналог нашего класса Condition
        //list.removeIf(new ConditionForRemove());

        list.removeIf(s -> s.startsWith("q")); //lambda выражение, краткая запись Predicate, имеющего единственный обязательный метод
        System.out.println("- - remove - -");
        System.out.println(list);

//        ListIterator<String> iterator = list.listIterator();
//        while (iterator.hasNext()) {
//            if (iterator.next().startsWith("q")) {
//                iterator.remove();
//            }
//        }

        List<String> list1 = Arrays.asList("s1", "s2", "s3"); //способ получения листа путем перечисления
        System.out.println(list1);

        //для примитивных типов данных используются классы-обертки:
        Integer h = 10;
        Integer h1 = new Integer(10);
        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(15);
        list2.add(20);
        System.out.println(list2);

        list2.addAll(Arrays.asList(1, 2, 3, 4));
        System.out.println(list2);
    }
}
