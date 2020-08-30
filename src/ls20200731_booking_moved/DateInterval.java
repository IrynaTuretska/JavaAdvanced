package ls20200731_booking_moved;

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

    public int countDays(){
        return finish.daysFormTheYearBegin() - start.daysFormTheYearBegin();
    }

    public Date getStart() {
        return start;
    }

    public Date getFinish() {
        return finish;
    }

    //временный метод для вывода количества дней
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
        return " [ " + start + "; " + finish + " ]";
    }
}
