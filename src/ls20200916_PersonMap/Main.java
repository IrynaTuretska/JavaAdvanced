package ls20200916_PersonMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Person, String> map;
        map = new HashMap<>();

        Person p1 = new Person("Ivan", 25);
        Person p2 = new Person("Anna", 36);
        Person p3 = new Person("Nick", 21);

        map.put(p1, p1.getName());
        map.put(p2, p2.getName());
        map.put(p3, p3.getName());

        System.out.println("p1 hashCode: " + p1.hashCode());
        System.out.println("p2 hashCode: " + p2.hashCode());
        System.out.println("p3 hashCode: " + p3.hashCode());

        System.out.println(map);

        System.out.println(map.get(p1));
        //перезапись объекта после изменения возраста, относится ко всем hashXXX
        map.remove(p1);
        p1.setAge(26);
        map.put(p1, p1.getName());

        System.out.println(map);
        System.out.println("after age changing: " + map.get(p1));

        System.out.println("p1 hashCode: " + p1.hashCode());

        //variant 1 - with Entry
        for (Map.Entry<Person, String> iEntry : map.entrySet()) {
            System.out.println(iEntry.getKey() + " " + iEntry.getValue());
        }
        System.out.println("- - - - -");

        //variant 2 - получили набор ключей, перекинули их в сет, перебор по ключам
        final Set<Person> people = map.keySet();
        for (Person p : people) {
            System.out.println(p + " " + map.get(p));
        }
        System.out.println("- - - - -");

        //variant 3 - lambda of the variant 1
        map.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
