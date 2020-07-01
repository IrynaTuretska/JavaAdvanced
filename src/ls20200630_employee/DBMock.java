package ls20200630_employee;

/**
 * JavaAdvanced 30.06.2020
 */
public class DBMock {
    public static Employee[] getEmployees(){
        Programmer p1 = new Programmer("Jack", 2000.0);
        Programmer p2 = new Programmer("Nick", 4000.0);
        Tester t1 = new Tester("Anna", 3000.0);
        Tester t2 = new Tester("Alex", 1800.0);

        Employee[] employees = new Employee[]{p1, p2, t1, t2, new Tester("Klara",3000.0)};
        return employees;
    }
}
