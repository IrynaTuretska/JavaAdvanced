package hw17_temperature;

/**
 * JavaAdvanced 07.07.2020
 */
public class Year {
    private int winter;
    private int spring;
    private int summer;
    private int autumn;

    public Year(int winter, int spring, int summer, int autumn) {
        this.winter = winter;
        this.spring = spring;
        this.summer = summer;
        this.autumn = autumn;
    }

    @Override
    public String toString() {
        return "Average temperature | winter: " + winter + ", spring: " + spring
                + ", summer: " + summer + ", autumn: " + autumn;
    }
}
