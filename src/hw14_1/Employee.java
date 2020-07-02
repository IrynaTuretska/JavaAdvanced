package hw14_1;

/**
 * JavaAdvanced 02.07.2020
 */
public class Employee {
    private String name;
    private String position;
    private double salary;
    private double managerBonus;

    public Employee(String name, String position, double salary, double managerBonus) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.managerBonus = managerBonus;
    }

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee | name: " + name + ", position: " + position + ", salary (EUR): " + salary;
    }

    public void pay() {
        System.out.println(name + ": to pay,EUR: " + (salary + managerBonus));
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public double getManagerBonus() {
        return managerBonus;
    }

    public void work() {
    }

    public void codeReview() {
    }
}
