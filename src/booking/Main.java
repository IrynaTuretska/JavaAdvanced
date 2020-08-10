package booking;

public class Main {
    public static void main(String[] args) {
        Booking b1 = new Booking(
                new StandardRoom("1", 2),
                new Person("Jack"),
                new DateInterval(new Date(30, 10, 2019), new Date(10, 2, 2020)));

        Booking b2 = new Booking(
                new SuiteRoom("2", 2),
                new Person("Nick"),
                new DateInterval(new Date(11, 8, 2020), new Date(13, 8, 2020)));

        Booking b3 = new Booking(
                new DeLuxeRoom("4", 2),
                new Person("Pier"),
                new DateInterval(new Date(11, 8, 2020), new Date(13, 8, 2021)));

        Booking b4 = new Booking(
                new DeLuxeRoom("12", 2),
                new Person("Alex"),
                new DateInterval(new Date(27, 12, 2020), new Date(4, 1, 2021)));

        BookingList bookingList = new ArrayBookingList(2);
//        bookingList.add(b1); //добавление элементов в список
//        bookingList.add(b2);
//        bookingList.add(b3);
//        bookingList.add(b4);
//
//        bookingList.print();

        Booking[] bookings = new Booking[]{b1, b2, b3, b4};
        //System.out.println("Booking with index 1: " + bookingList.getBookingByIndex(1, bookings));
        //bookingList.findBooking(b4, bookings);

        b1.getDateInterval().dateIntervalsIntersection(b1.getDateInterval(), b2.getDateInterval());
        b1.getDateInterval().dateIntervalsIntersection(b2.getDateInterval(), b3.getDateInterval());


//        Arrays.sort(bookings, new ComparatorByName());
//        System.out.println("Sort by name: \n" + Arrays.toString(bookings));
//
//        Arrays.sort(bookings, new ComparatorByStartDate());
//        System.out.println("\nSort by check-in date: \n" + Arrays.toString(bookings));
//
//        Arrays.sort(bookings, new ComparatorByDaysQty());
//        System.out.println("\nSort by days q-ty: \n" + Arrays.toString(bookings));
//
//        Arrays.sort(bookings, new ComparatorByAmount());
//        System.out.println("\nSort by amount: \n" + Arrays.toString(bookings));


    }
}
