package ls20200824_ArrayList_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // LinkedList<> or ArrayList<>

        ArrayList<String> arrayList = (ArrayList<String>) list; // кастование
        arrayList.trimToSize(); // метод, уменьшающий массив до реальных размеров, работает только для ArrayList<>!

        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add(0, "str4"); //перенос элемента в нулевой индекс
        list.add("str5");
        list.add("str6");
        list.add("str7");
        list.add("str8");

        System.out.println(list);

        if (list.size() > 7) {//если условие не выполняется, то ошибки не будет
            System.out.println(list.get(7));
        }
        System.out.println("- - - - FOR - - - - ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove(0);
        System.out.println(list.size());

        System.out.println("- - - FOR-EACH - - - ");
        for (String s : list) {
            System.out.print(s + ", ");
        }
        System.out.println();
        System.out.println("- - - Sort List - - -");
        list.sort(new StringComparator());
        System.out.print(list + ", ");

        System.out.println();
        System.out.println("Index of element str6: " + list.indexOf("str6"));

        List<Person> people = new ArrayList<>();
        people.add(new Person("Jack1"));
        people.add(new Person("Jack2"));
        people.add(new Person("Jack3"));

        Person person = new Person("Jack2");
        System.out.println("Index of person with name Jack2: " + people.indexOf(person));
    }
}
