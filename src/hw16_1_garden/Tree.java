package hw16_1_garden;

/**
 * JavaAdvanced 05.07.2020
 */
public class Tree extends Plant {
    int springGrowth = 15;
    int summerGrowth = 15;
    int autumnGrowth = 5;
    int winterGrowth = 5;

    public Tree(String name, int startGrowth) {
        super(name, startGrowth);
    }

    public void spring() {
        System.out.println(getName() + ": spring growth, cm: " + (getStartGrowth() + springGrowth));
    }

    public void summer() {
        System.out.println(getName() + ": summer growth, cm: " + (getStartGrowth() + springGrowth + summerGrowth));
    }

    public void autumn() {
        System.out.println(getName() + ": autumn growth, cm: " + (getStartGrowth() + springGrowth
                + summerGrowth + autumnGrowth));
    }

    public void winter() {
        System.out.println(getName() + ": winter growth, cm: " + (getStartGrowth() + springGrowth
                + summerGrowth + autumnGrowth + winterGrowth));
    }
}