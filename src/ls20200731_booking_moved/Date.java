package ls20200731_booking_moved;

/**
 * JavaAdvanced 31.07.2020
 */
public class Date {
    private int day;
    private int month;
    private int year;

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

    public int checkDaysInMonth(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (checkLeapYear(year) == 366) {
                    return 29;
                } else return 28;
        }
        return month;
    }

    public int daysFormTheYearBegin() {
        int day = 1;
        int month = 1;
        for (int i = 1; i < month; i++) {
            month = i * checkDaysInMonth(month);
            month++;
        }
        return checkLeapYear(year) - month + day;
    }

    @Override
    public String toString() {
        return day + "-" + month + "-" + year;
    }
}
