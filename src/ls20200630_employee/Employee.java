package ls20200630_employee;

/**
 * JavaAdvanced 30.06.2020
 */
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override // означает, что метод переопределен
    public String toString() {
        return "Employee " + name + " ( " + salary + " )";
    }

    //overloading - два одинаковых метода  одном классе
    public void pay() {
        System.out.println("pay " + salary + " EUR for " + name);
    }

    public void pay(int bonus) {
        System.out.println("pay " + (salary + bonus) + " EUR for " + name);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void work() {
    }
}
