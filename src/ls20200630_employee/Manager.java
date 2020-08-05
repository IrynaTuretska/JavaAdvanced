package ls20200630_employee;

/**
 * JavaAdvanced 02.07.2020
 */
public class Manager extends Employee implements ManageAble{
    private double managerBonus;

    public Manager(String name, double salary, double managerBonus) {
        super(name, salary);
        this.managerBonus = managerBonus;
    }
    public void manage(){
        System.out.println("All managers can manage!");
    }

    @Override
    public void pay() {
        System.out.println("pay for manager " + getSalary() + " bonus " + managerBonus + " EUR for " + getName());
    }
}

