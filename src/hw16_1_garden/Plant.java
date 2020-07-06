package hw16_1_garden;

/**
 * JavaAdvanced 05.07.2020
 */
public class Plant {
    private String name;
    private int startGrowth;

    public Plant(String name, int startGrowth) {
        this.name = name;
        this.startGrowth = startGrowth;
    }

    public String getName() {
        return name;
    }

    public int getStartGrowth() {
        return startGrowth;
    }

    @Override
    public String toString() {
        return "Plant " + name + ", startGrowth= " + startGrowth;
    }

    public void spring() {
    }

    public void summer() {
    }

    public void autumn() {
    }

    public void winter() {
    }

    public void year() {
        System.out.println("Plant: " + name + ", start growth, cm: " + startGrowth+"growths during the year, cm: ");
    }
}
