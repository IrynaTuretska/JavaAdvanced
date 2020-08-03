package ls20200731_Booking;

/**
 * JavaAdvanced 31.07.2020
 */
public class DateInterval {
    private Date start;
    private Date finish;
    //    private static Random rnd = new Random(System.currentTimeMillis());
    //    private int days = 0;

    public DateInterval(Date start, Date finish) {
        this.start = start;
        this.finish = finish;
    }

    public Date getStart() {
        return start;
    }

    public Date getFinish() {
        return finish;
    }

    public int countDays() {
        int days;
        if (start.getYear() == finish.getYear()) {
            days = finish.daysFormTheYearBegin(finish.getDay(), finish.getMonth(), finish.getYear())
                    - start.daysFormTheYearBegin(start.getDay(), start.getMonth(), start.getYear());
        } else {
            days = start.checkLeapYear(getStart().year)
                    - start.daysFormTheYearBegin(start.getDay(), start.getMonth(), start.getYear())
                    + finish.daysFormTheYearBegin(finish.getDay(), finish.getMonth(), finish.getYear());
        }
        return days;
    }


    //рандомный вывод количества дней
//    public int getDays() {
//        int min = 1;
//        int max = 30;
//        if (days == 0) {
//            days = min + rnd.nextInt(max - min + 1);
//        }
//        return days;
//    }

    @Override
    public String toString() {
        return " [check in: " + start + "; check out: " + finish + "]";
    }
}
