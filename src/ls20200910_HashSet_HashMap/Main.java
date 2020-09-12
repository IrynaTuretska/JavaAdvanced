package ls20200910_HashSet_HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Map<String, String> map = new HashMap<>();
        //map.keySet(); //набор ключей - все уникальные, Value - может повторяться

        set.add("1");
        set.add("4");
        set.add("2");
        set.add("3");

        System.out.println(set);

        map.put("1", "q");
        map.put("4", "w");
        map.put("2", "e");
        map.put("3", "r");
        System.out.println(map);
    }
}
