package booking;

import java.util.Arrays;

/**
 * JavaAdvanced 30.07.2020
 */
public class Main {
    public static void main(String[] args) {
        Booking b1 = new Booking(
                new booking.StandardRoom("1", 2),
                new booking.Person("Jack"),
                new booking.DateInterval(new booking.Date(30, 7, 2020), new booking.Date(10, 8, 2020)));

        Booking b2 = new Booking(
                new booking.SuiteRoom("2", 2),
                new booking.Person("Nick"),
                new booking.DateInterval(new booking.Date(11, 8, 2020), new booking.Date(13, 8, 2020)));

        Booking b3 = new Booking(
                new DeLuxeRoom("4", 2),
                new booking.Person("Pier"),
                new booking.DateInterval(new booking.Date(30, 12, 2020), new booking.Date(4, 1, 2021)));

        Booking b4 = new Booking(
                new DeLuxeRoom("12", 2),
                new booking.Person("Alex"),
                new booking.DateInterval(new booking.Date(30, 12, 2020), new booking.Date(4, 1, 2021)));

        BookingList bookingList = new booking.ArrayBookingList(2);
//        bookingList.add(b1);
//        bookingList.add(b2);
//        bookingList.add(b3);
//        bookingList.add(b4);
//
//        bookingList.print();

        Booking[] bookings = new Booking[]{b1, b2, b3, b4};
        System.out.println("Booking with index 1: " + bookingList.getBookingByIndex(1, bookings));
        bookingList.findBooking(b4, bookings);

    }
}
