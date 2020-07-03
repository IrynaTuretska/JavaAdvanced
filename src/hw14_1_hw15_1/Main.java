package hw14_1_hw15_1;

/**
 * JavaAdvanced 02.07.2020
 */
public class Main {
    public static void main(String[] args) {

        EmployeeArray.printAll(EmployeeArray.getEmployees());
        System.out.println("- - - - - -");
        EmployeeArray.payAll(EmployeeArray.getEmployees());
        System.out.println("- - - - - -");
        EmployeeArray.workAll(EmployeeArray.getEmployees());
        System.out.println("- - - - - -");
        EmployeeArray.codeReviewAll(EmployeeArray.getEmployees());


        //Task 14-1 result:

//        CProgrammer cp1 = new CProgrammer("John", "CProgrammer", 2500);
//        CProgrammer cp2 = new CProgrammer("Jim", "CProgrammer", 2900);
//        JavaProgrammer jp1 = new JavaProgrammer("Lev", "JavaProgrammer", 2600);
//        JavaProgrammer jp2 = new JavaProgrammer("Leon", "JavaProgrammer", 2800);
//        JavaScriptProgrammer js1 = new JavaScriptProgrammer("Alex", "JavaScriptProgrammer", 3200);
//        JavaScriptProgrammer js2 = new JavaScriptProgrammer("Alan", "JavaScriptProgrammer", 3100);
//        Manager manager = new Manager("Max", "Manager", 4200, 600);
//
//        Employee[] employees = new Employee[]{cp1, cp2, jp1, jp2, js1, js2, manager};
//
//
//        for (Employee employee : employees) {
//            System.out.println(employee.toString());
//        }
//        System.out.println("- - - - - - -");
//        for (Employee employee : employees) {
//            employee.pay();
//        }
//
//        System.out.println("- - - - - - -");
//        for (Employee employee : employees) {
//            employee.work();
//            System.out.print("  ");
//            employee.codeReview();
//        }
    }
}
