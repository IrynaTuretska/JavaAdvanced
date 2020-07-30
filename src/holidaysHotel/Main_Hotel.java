package holidaysHotel;

/**
 * JavaAdvanced 13.07.2020
 */
public class Main_Hotel {
    public static void main(String[] args) {

        Room room1 = new Room(2, 250.0, "Suit");
        Client client1 = new Client("Frau Schmidt", "Dresden");
        Days getCheckIn1 = new Days(15, "July", 2020);
        Days getCheckOut1 = new Days(25, "July", 2020);

        Booking booking1 = new Booking(getCheckIn1, getCheckOut1, client1, room1);
        System.out.println("Booking #1: " +booking1.toString());

        Room room2 = new Room(1, 270.0, "Lux");
        Client client2 = new Client("Herr Samstag", "Leipzig");
        Days getCheckIn2 = new Days(20, "August", 2020);
        Days getCheckOut2 = new Days(23, "August", 2020);

        Booking booking2 = new Booking(getCheckIn2, getCheckOut2, client2, room2);
        System.out.println("\nBooking #2: "+booking2.toString());

    }
}
