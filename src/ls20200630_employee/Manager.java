package ls20200630_employee;

/**
 * JavaAdvanced 02.07.2020
 */
public class Manager extends Employee {
    private double managerBonus;

    public Manager(String name, double salary, double managerBonus) {
        super(name, salary);
        this.managerBonus = managerBonus;
    }

    @Override
    public void pay() {
        System.out.println("pay for manager " + getSalary() + " bonus " + managerBonus + " EUR for " + getName());
    }
}

