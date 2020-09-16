package ls20200914_ListHashSet;

import org.junit.jupiter.api.Test;
import java.util.*;
import static ls20200914_ListHashSet.Main.getUniqueString;
import static org.junit.jupiter.api.Assertions.*;

class GetUniqueStringTest {
    @Test
    public void getUniqueString_UniqueString_True() {
        List<String> list = Arrays.asList("n", "b", "c", "d");
        List<String> list2 = Arrays.asList("b", "n", "c", "d");
        Set<String> hashSet = new HashSet<>(list);
        Set<String> hashSet2 = new HashSet<>(getUniqueString(list2));
        assertTrue(hashSet.equals(hashSet2));
    }

    @Test
    public void getUniqueString_NotUniqueString_False() {
        List<String> list = Arrays.asList("a", "b", "b", "d");
        List<String> list1 = Arrays.asList("f", "s", "v", "t");
        Set<String> expectedHash = new HashSet<>(list);
        Set<String> hashSet = new HashSet<>(getUniqueString(list1));
        assertFalse(expectedHash.equals(hashSet));
    }

    @Test
    public void getUniqueString_NullString_Equals() {
        List<String> list = Arrays.asList(null);
        assertEquals(list, getUniqueString(new ArrayList<>(list)));
    }

    @Test
    public void getUniqueString_EmptyString_Equals() {
        List<String> list = Arrays.asList();
        assertEquals(list, getUniqueString(new ArrayList<>(new HashSet<>(list))));
    }

}