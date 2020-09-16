package ls20200915_Map;

import org.junit.jupiter.api.Test;

import java.util.*;

import static ls20200915_Map.Main.getListOfDuplicates;
import static org.junit.jupiter.api.Assertions.*;

class ListDuplicatesTest {
    @Test
    public void listOfDuplicates_twoLists_newListOfDuplicates() {
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

        Set<Person> set1 = new HashSet<>();
        set1.add(new Person("Ivan"));
        set1.add(new Person("Nick"));

        assertEquals(set1, new HashSet<Person>(getListOfDuplicates(list1, list2)));
    }

    @Test
    public void listOfDuplicates_NoDuplicates_EmptyList() {
        List<Person> list1 = Arrays.asList(
                new Person("Anna"),
                new Person("Sabrina"),
                new Person("Nick"));

        List<Person> list2 = Arrays.asList(
                new Person("Ivan"),
                new Person("Stefan"),
                new Person("Sandra"));

        assertEquals(new ArrayList<Person>(), getListOfDuplicates(list1, list2));
    }

    @Test
    public void listOfDuplicates_ListNull_EmptyList() {
        List<Person> list1 = null;
        List<Person> list2 = Arrays.asList(
                new Person("Ivan"),
                new Person("Stefan"),
                new Person("Sandra"));

        assertEquals(new ArrayList<Person>(), getListOfDuplicates(list1, list2));
        assertEquals(new ArrayList<Person>(), getListOfDuplicates(list2, list1));
    }

    @Test
    public void listOfDuplicates_ListEmpty_EmptyList() {
        List<Person> list1 = new ArrayList<>();
        List<Person> list2 = Arrays.asList(
                new Person("Ivan"),
                new Person("Stefan"),
                new Person("Sandra"));

        assertEquals(new ArrayList<Person>(), getListOfDuplicates(list1, list2));
        assertEquals(new ArrayList<Person>(), getListOfDuplicates(list2, list1));
    }

}