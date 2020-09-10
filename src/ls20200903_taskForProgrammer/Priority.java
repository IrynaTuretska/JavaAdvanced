package ls20200903_taskForProgrammer;

public enum Priority implements Comparable<Priority> {
    //ENUM реализует Comparable без методов, следует указанной приоритетности - как записано
    HIGH,
    NORMAL,
    LOW;

    // при использовании Comparable метод не нужен
    public int numberForPriority() {
        if (this.equals(Priority.HIGH)) {
            return 3;
        } else if (this.equals(Priority.NORMAL)) {
            return 2;
        } else
            return 1;
    }
}
