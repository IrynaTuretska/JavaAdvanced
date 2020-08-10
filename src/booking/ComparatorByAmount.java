package booking;

import java.util.Comparator;

/**
 * JavaAdvanced 09.08.2020
 */
public class ComparatorByAmount implements Comparator<Booking> {
    @Override
    public int compare(Booking b1, Booking b2) {
        return (int) (b1.getPrice() - b2.getPrice());
    }
}
