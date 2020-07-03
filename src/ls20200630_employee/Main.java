package ls20200630_employee;
/**
 * JavaAdvanced 30.06.2020
 */

// is a: programmer is an employee, tester is an employee
// дочерний класс является сущностью родительского класса
public class Main {
    public static void main(String[] args) {
        //цепочка наследования:
        //Object -> ls20200630_employee.Employee -> ls20200630_employee.Programmer
        Programmer prog = new Programmer("Uwe", 1000); //! после создания строки ниже, эта не действует -> garbage collector
        prog = new Programmer("Uwe2", 1500); // создали новый объект вместо старого (строка выше - она удаляется),
        // переменная смотрит на другой объект

        Employee emp2 = new Programmer("Ted",2000); //разные типы переменных - слева родительский, справа - наследующий
        //всякий programmer is employee

        String[] bonusList = {"Jack", "Anna", "Nick"};

        Employee[] employees = DBMock.getEmployees();
        Programmer[]programmers = DBMock.getProgrammers();

//        for (Employee employee : employees) {
//            if (isBonus(bonusList, employee.getName())) {
//                employee.pay(550);
//            } else {
//                employee.pay();
//            }
//        }
        for (Employee employee : employees) {
            payForEmployee(employee);
        }

        for (Employee employee : employees) {
            employee.work();
        }
        System.out.println("- - - - - -");
        for(Programmer programmer : programmers){
            System.out.println(programmer.getName());
            System.out.print("  ");
            programmer.codeReview();
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

    public static void payForEmployee (Employee employee){
        employee.pay();
    }
}
