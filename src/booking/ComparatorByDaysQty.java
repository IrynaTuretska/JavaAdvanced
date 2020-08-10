package booking;

import java.util.Comparator;

/**
 * JavaAdvanced 09.08.2020
 */
public class ComparatorByDaysQty implements Comparator<Booking> {
    @Override
    public int compare(Booking b1, Booking b2) {
        return b1.getDateInterval().getDays() - b2.getDateInterval().getDays();
    }
}
