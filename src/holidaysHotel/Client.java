package holidaysHotel;

/**
 * JavaAdvanced 13.07.2020
 */
public class Client {
    private String name;
    private String city;

    public Client(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return this.name + "; City - " + this.city;
    }
}
