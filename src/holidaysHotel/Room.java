package holidaysHotel;

/**
 * JavaAdvanced 13.07.2020
 */
public class Room {
    private int personQty;
    private double price;
    private String category; // standard, suite, double, lux

    public Room(int personQty, double price, String category) {
        this.personQty = personQty;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Person q-ty - " + this.personQty + "; Price for one night - " + this.price + " EUR; Category - " + this.category;
    }
}
