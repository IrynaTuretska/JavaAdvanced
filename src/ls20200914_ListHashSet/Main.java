package ls20200914_ListHashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//дан список строк, получить новый список, в котором исключить повторяющиеся элементы

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Anna");
        stringList.add("Olga");
        stringList.add("Irina");
        stringList.add("Petr");
        stringList.add("Anna");
        stringList.add("Olga");
        stringList.add("Ivan");
        stringList.add("Anna");
        System.out.println(getUniqueString(stringList));

        List<Person> personList = Arrays.asList(
                new Person("Ivan"),
                new Person("Anna"),
                new Person("Anna"),
                new Person("Maria"),
                new Person("Maria"),
                new Person("Paul"));
        System.out.println(getUniquePerson(personList).toString());
    }

    public static List<String> getUniqueString(List<String> list) {
        if (list == null) return new ArrayList<String>();
        //HashSet не гарантирует порядок элементов, может некорректно сработать equals()
        List<String> newList = new ArrayList<>(new HashSet<String>(list));
        return newList;
    }

    public static List<Person> getUniquePerson(List<Person> list) {
        if (list == null) return new ArrayList<Person>();
        List<Person> newList = new ArrayList<>(new HashSet<Person>(list));
        return newList;
    }
}
