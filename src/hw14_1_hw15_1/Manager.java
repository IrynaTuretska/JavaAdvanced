package hw14_1_hw15_1;

/**
 * JavaAdvanced 02.07.2020
 */
public class Manager extends Employee {
    private double managerBonus;

    public Manager(String name, String position, double salary, double managerBonus) {
        super(name, position, salary);
        this.managerBonus = managerBonus;
    }

    @Override
    public void pay() {
        System.out.println(getName() + ": to pay,EUR: " + getSalary() + " bonus " + managerBonus);
    }

    public void work() {
        System.out.println("My name is " + getName() + ". I'm " + getPosition());
    }

//    @Override
//    public String toString() {
//        return "Manager  | name: " + getName() + ", position: " + getPosition() + ", salary (EUR): " + getSalary();
//    }

}
