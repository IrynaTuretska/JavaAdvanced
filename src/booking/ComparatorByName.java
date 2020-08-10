package booking;

import java.util.Comparator;

/**
 * JavaAdvanced 09.08.2020
 */
public class ComparatorByName implements Comparator <Booking> {
    @Override
    public int compare(Booking b1, Booking b2) {
        return b1.getPerson().getName().compareTo(b2.getPerson().getName());
    }
}
