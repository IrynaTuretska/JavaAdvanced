package booking;

public class Booking {
    private booking.Room room;
    private booking.Person person;
    private booking.DateInterval dateInterval;


    public Booking(booking.Room room, booking.Person person, booking.DateInterval dateInterval) {
        this.room = room;
        this.person = person;
        this.dateInterval = dateInterval;
    }

    public booking.Room getRoom() {
        return room;
    }

    public booking.Person getPerson() {
        return person;
    }

    public booking.DateInterval getDateInterval() {
        return dateInterval;
    }

    public double getPrice() {
        return this.room.getPrice() * this.dateInterval.getDays();
    }

    @Override
    public String toString() {
        return "Booking: " + room +
                " person: " + person +
                " " + dateInterval +
                " \n\tprice for " + this.dateInterval.getDays() + " days is " +
                getPrice() + " EUR";
    }
}
