package ls20200630_employee;

/**
 * JavaAdvanced 30.06.2020
 */
public class Tester extends Employee {
    public Tester(String name, double salary) {
        //ссылка на родительский объект, вызывает его конструктор
        // !!! всегда первая строка кода в конструкторе дочернего класса
        super(name, salary);
    }

    public void work() {
        System.out.println("tester: I'm testing program");
    }

        @Override
    public String toString() {//вызываем геттер родительского класса
        return "ls20200630_employee.Tester " + super.getName() + " ( " + super.getSalary() + " )";
    }

//    public void pay() {
//        System.out.println("pay " + getSalary() + " EUR");
//    }

}
