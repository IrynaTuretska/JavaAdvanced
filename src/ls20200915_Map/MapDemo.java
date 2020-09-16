package ls20200915_Map;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Q", "w", "e", "w");
        List<String> list2 = Arrays.asList("w", "Q", "e", "e");

        Set<String> hashSet1 = new HashSet<>(list1);
        Set<String> hashSet2 = new HashSet<>(list2);

        //возможна ошибка, если есть дубликаты, но разных букв
        System.out.println(hashSet1.equals(hashSet2) && (list1.size() == list2.size()));

        Map<String, Integer> map = new HashMap<>();
        for (String st : list1) {
            Integer i = map.get(st);
            if (i == null) {
                map.put(st, 1);
            } else {
                map.put(st, ++i);
            }
        }
        System.out.println(map);

//        Map<String, Integer> map2 = new HashMap<>();
//        for (String st : list2) {
//            Integer i = map2.get(st);
//            if (i == null) {
//                map2.put(st, 1);
//            } else {
//                map2.put(st, ++i);
//            }
//        }
//        System.out.println(map2);

        for (String st : list2) {
            Integer i = map.get(st);
            if (i == null) {
                System.out.println("not equal");
            } else {
                i--;
                if (i.equals(0)) {
                    map.remove(st);
                } else {
                    map.put(st, i);
                }
            }
        }
        System.out.println(map);

        //Получить Map, в котором ключ - Person, а value - boolean, встречался ли Person больше одного раза (true)
        Map<String, Boolean> map3 = new HashMap<>();
        for (String st : list1) {
            if (map3.containsKey(st)) {
                map3.put(st, true);
            } else {
                map3.put(st, false);
            }
        }
        System.out.println(map3);
    }
}
