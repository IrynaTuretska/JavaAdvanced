package hw16_1_garden;

/**
 * JavaAdvanced 05.07.2020
 */
public class Bush extends Plant {
    private int springGrowth = 10;
    private int summerGrowth = 10;
    private int autumnGrowth = 3;

    public Bush(String name, int startGrowth) {
        super(name, startGrowth);
    }

    @Override
    public int getSpringGrowth() {
        return springGrowth;
    }

    @Override
    public int getSummerGrowth() {
        return summerGrowth;
    }

    @Override
    public int getAutumnGrowth() {
        return autumnGrowth;
    }
    @Override
    public int getWinterGrowth() {
        return 0;
    }
}
