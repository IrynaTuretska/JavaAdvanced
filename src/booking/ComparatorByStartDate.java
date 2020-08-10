package booking;

import java.util.Comparator;

/**
 * JavaAdvanced 09.08.2020
 */
public class ComparatorByStartDate implements Comparator<Booking> {
    @Override
    public int compare(Booking b1, Booking b2) {
        return b1.getDateInterval().getStart().compareTo(b2.getDateInterval().getStart());
    }
}
