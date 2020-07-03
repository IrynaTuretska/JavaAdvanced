package hw14_1_hw15_1;

/**
 * JavaAdvanced 02.07.2020
 */
public class Employee{
    private String name;
    private String position;
    private double salary;

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
        System.out.println(name + ": to pay,EUR: " + salary);
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

    public void work() {
    }

    public void codeReview() {
    }
}
