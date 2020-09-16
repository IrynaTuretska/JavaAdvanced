package ls20200915_Map;

import java.util.*;

public class Main {
    //даны два списка Person, получить список из person, присутствующих в обоих списках
    public static void main(String[] args) {
        List<Person> list1 = Arrays.asList(
                new Person("Ivan"),
                new Person("Anna"),
                new Person("Sabrina"),
                new Person("Nick"));

        List<Person> list2 = Arrays.asList(
                new Person("Ivan"),
                new Person("Stefan"),
                new Person("Sandra"),
                new Person("Nick"));

        System.out.println(getListOfDuplicates(list1, list2).toString());

    }

    public static List<Person> getListOfDuplicates(List<Person> list1, List<Person> list2) {
        List<Person> result = new ArrayList<>();
        if (list1 != null && list2 != null) {
            Set<Person> set1 = new HashSet<>(list1);
            set1.retainAll(list2);
            result = new ArrayList<>(set1);
        }
        return result;
    }

   public static List<Person> getListOfDuplicatesTwo(List<Person> list1, List<Person> list2) {
       List<Person> result = new ArrayList<>();
       if (list1 != null && list2 != null){
           Set<Person> set1 = new HashSet<>(list1);
           for (Person p: list2){
               if(set1.contains(p)){
                   result.add(p);
               }
           }
       }
       return result;
   }
}
