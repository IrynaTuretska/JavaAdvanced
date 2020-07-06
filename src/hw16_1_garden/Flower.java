package hw16_1_garden;

/**
 * JavaAdvanced 05.07.2020
 */
public class Flower extends Plant {
    int springGrowth = 20;
    int summerGrowth = 10;

    public Flower(String name, int startGrowth) {
        super(name, startGrowth);
    }

    public void spring() {
        System.out.println(getName() + ": spring growth, cm: " + (getStartGrowth() + springGrowth));
    }

    public void summer() {
        System.out.println(getName() + ": summer growth, cm: " + (getStartGrowth() + springGrowth + summerGrowth));
    }

    public void autumn() {
        System.out.println(getName() + ": autumn growth, cm: " + (getStartGrowth() + springGrowth + summerGrowth));
    }

    public void winter() {
        System.out.println(getName() + ": winter growth, cm: " + getStartGrowth());
    }
}
