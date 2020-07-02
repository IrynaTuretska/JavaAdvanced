package hw14_1;

/**
 * JavaAdvanced 02.07.2020
 */
public class Manager extends Employee {
    public Manager(String name, String position, double salary, double managerBonus) {
        super(name, position, salary, managerBonus);
    }

    @Override
    public String toString() {
        return "Manager  | name: " + getName() + ", position: " + getPosition() + ", salary (EUR): " + getSalary();
    }
}
