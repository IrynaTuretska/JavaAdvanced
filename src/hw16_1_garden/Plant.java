package hw16_1_garden;

/**
 * JavaAdvanced 05.07.2020
 */
public abstract class Plant {
    private String name;
    private int startGrowth;
    private int growth; //отражает текущее состояние объекта, меняется с каждым выводом нового метода

    private int springGrowth = 0; //атрибуты объекта, состояние, в котором находится объект
    private int summerGrowth = 0;
    private int autumnGrowth = 0;
    private int winterGrowth = 0;

    public Plant(String name, int startGrowth) {
        this.name = name;
        this.startGrowth = startGrowth;
        this.growth = startGrowth;
    }

    public abstract int getSpringGrowth();

    public abstract int getSummerGrowth();

    public abstract int getAutumnGrowth() ;

    public abstract int getWinterGrowth();

    protected void setGrowth(int growth) { //доступен только наследникам
        this.growth = growth;
    }

    public int getGrowth() { //чтобы плюсовать каждый раз новое значение
        return growth;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Plant " + name + ", startGrowth= " + startGrowth;
    }

    protected void spring() {
        setGrowth(getGrowth() + getSpringGrowth());
        System.out.println(getName() + ": spring growth, cm: " + getGrowth());
    }

    protected void summer() {
        setGrowth(getGrowth() + getSummerGrowth());
        System.out.println(getName() + ": summer growth, cm: " + getGrowth());
    }

    protected void autumn() {
        setGrowth(getGrowth() + getAutumnGrowth());
        System.out.println(getName() + ": autumn growth, cm: " + getGrowth());
    }

    protected void winter() {
        setGrowth(getGrowth() + getWinterGrowth());
        System.out.println(getName() + ": winter growth, cm: " + getGrowth());
    }

//    protected abstract void spring();
//    protected abstract void summer();
//    protected abstract void autumn();
//    protected abstract void winter();

    public void year() {
        spring();
        summer();
        autumn();
        winter();
    }
}
