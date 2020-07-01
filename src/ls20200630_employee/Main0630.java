package ls20200630_employee;

/**
 * JavaAdvanced 30.06.2020
 */

// is a: programmer is an employee, tester is an employee
// дочерний класс является сущностью родительского класса
public class Main0630 {
    public static void main(String[] args) {
        //цепочка наследования:
        //Object -> ls20200630_employee.Employee -> ls20200630_employee.Programmer

        String[] bonusList = {"Jack", "Anna", "Nick"};

        Employee[] employees = DBMock.getEmployees();

        for (Employee employee : employees) {
            if (isBonus(bonusList, employee.getName())) {
                employee.pay(550);
            } else {
                employee.pay();
            }
        }

        for (Employee employee : employees) {
            employee.work();
        }
    }

    public static boolean isBonus(String[] bonusList, String name) {
        for (String str : bonusList) {
            if (str.equals(name)) {
                return true;
            }
        }
        return false;
    }
}
