package ls20200914_ListHashSet;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GetUniquePersonTest {
    @Test
    public void getUniquePerson_ListOfUniquePerson_Equals() {
        List<Person> personList = Arrays.asList(
                new Person("Anna"),
                new Person("Paul"),
                new Person("Ivan"),
                new Person("Maria"));
        assertEquals(personList, Main.getUniquePerson(new ArrayList<>(new HashSet<Person>(personList))));
    }

}