package hw_Booking_0803;

/**
 * JavaAdvanced 31.07.2020
 */
public class Date {
    private int day;
    private int month;
    public int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int checkLeapYear(int year) {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            return 366;
        } else
            return 365;
    }

    public int daysFromTheYearBegin(int day, int month, int year) {
        int daysInMonth = 0;
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daysInMonth += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInMonth += 30;
                    break;
                case 2:
                    if (checkLeapYear(year) == 366) {
                        daysInMonth += 29;
                    } else daysInMonth += 28;
                    break;
            }
        }
        return daysInMonth + day;
    }

    @Override
    public String toString() {
        return day + "-" + month + "-" + year;
    }
}
