package ls20200805_Comparator;

import java.util.Comparator;

/**
 * JavaAdvanced 06.08.2020
 */
public class PersonComparatorByName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
