package hw_Booking_0803;

/**
 * JavaAdvanced 31.07.2020
 */
public class Booking {
    //private int id;
    private Room room;
    private Person person;
    private DateInterval dateInterval;

    public Booking(Room room, Person person, DateInterval dateInterval) {
        this.room = room;
        this.person = person;
        this.dateInterval = dateInterval;
    }

    public Room getRoom() {
        return room;
    }

    public Person getPerson() {
        return person;
    }

    public double getPrice() {
        return this.room.getPrice() * this.dateInterval.countDays();
    }

    @Override
    public String toString() {
        return "Booking: " + room + ", person: " + person + dateInterval
                + "\n\tprice for " + dateInterval.countDays() + " days is " + getPrice() + " Euro";
    }
}
