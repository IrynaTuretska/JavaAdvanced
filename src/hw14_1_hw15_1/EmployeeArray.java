package hw14_1_hw15_1;

/**
 * JavaAdvanced 03.07.2020
 */
public class EmployeeArray {

    public static Employee[] employees = new Employee[]{
            new CProgrammer("John", "CProgrammer", 2500),
            new CProgrammer("Jim", "CProgrammer", 2900),
            new JavaProgrammer("Lev", "JavaProgrammer", 2600),
            new JavaProgrammer("Leon", "JavaProgrammer", 2800),
            new JavaScriptProgrammer("Alex", "JavaScriptProgrammer", 3200),
            new JavaScriptProgrammer("Alan", "JavaScriptProgrammer", 3100),
            new Manager("Max", "Manager", 4200, 600),
            new Manager("Paul", "Manager", 4500, 800)};

    public EmployeeArray() {
    }

    public static Employee[] getEmployees() {
        return employees;
    }

    public static void printAll(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void payAll(Employee[] employees) {
        for (Employee employee : employees) {
            employee.pay();
        }
    }

    public static void workAll(Employee[] employees) {
        for (Employee employee : employees) {
            employee.work();
        }
    }

    public static void codeReviewAll(Employee[] employees) {
        for (Employee employee : employees) {
            employee.codeReview();
        }
    }
}
