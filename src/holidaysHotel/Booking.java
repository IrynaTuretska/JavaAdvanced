package holidaysHotel;

/**
 * JavaAdvanced 13.07.2020
 */
public class Booking {
    Client client;
    Room room;
    Days checkIn;
    Days checkOut;


    public Booking(Days checkIn, Days checkOut, Client client, Room room) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.client = client;
        this.room = room;
    }

    @Override
    public String toString() {
        return "\nClient information: " + this.client
                + "\nRoom: " + this.room
                + "\nCheckIn date: " + this.checkIn
                + "\nCheckOut date: " + this.checkOut;
    }
}
