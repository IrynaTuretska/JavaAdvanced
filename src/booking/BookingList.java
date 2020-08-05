package booking;

/**
 * Booking 04.08.2020
 */
public interface BookingList {
    void add(booking.Booking booking);
    int size();
    void print();

    booking.Booking getBookingByIndex(int index, Booking[] bookings);

    booking.Booking findBooking(Booking booking,Booking[] bookings);

}
