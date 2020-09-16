package ls20200914_ListHashMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Anna");
        stringList.add("Olga");
        stringList.add("Irina");
        stringList.add("Petr");
        stringList.add("Ivan");
        stringList.add("Petr");
        stringList.add("Anna");
        stringList.add("Olga");
        stringList.add("Ivan");
        stringList.add("Anna");

        //System.out.println(getMapOfStrings(stringList).toString());


        List<Person> people = Arrays.asList(
                new Person("Ivan", 20),
                new Person("Tom", 36),
                new Person("Tom", 36),
                new Person("Ivan", 22),
                new Person("Ivan", 22),
                new Person("Anna", 30),
                new Person("John", 18),
                new Person("Ivan", 22),
                new Person("Sandra", 12));
    }

    public static Map<String, Integer> getMapOfStrings(List<String> list) {
        Map<String, Integer> mapResult = new HashMap<>();
        if (list == null) return mapResult;
        for (String element : list) {
            if (mapResult.containsKey(element)) {
                Integer i = mapResult.get(element); //получили Integer, соответствующий ключу
                i++;
                mapResult.put(element, i);

                //mapResult.put(element,mapResult.get(element)+1); //короткая запись
            } else {
                mapResult.put(element, 1);
            }
        }
        return mapResult;
    }

    public static Map<String, Boolean> checkIfInList(List<Person> people) {
        Map<String, Boolean> result = new HashMap<>();
        if (people == null) return result;
        for (Person element : people) {



        }
        return result;
    }


}
