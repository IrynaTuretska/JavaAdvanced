package holidaysHotel;

/**
 * JavaAdvanced 21.07.2020
 */
public class Days {
    int day;
    String month;
    int year;

    public Days(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + " " + this.month + " " + this.year;
    }
}
