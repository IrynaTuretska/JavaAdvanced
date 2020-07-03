package ls20200630_employee;

/**
 * JavaAdvanced 30.06.2020
 */
public class Programmer extends Employee {
    public Programmer(String name, double salary) {
        super(name, salary);
    }
    public void work() {
        System.out.println("programmer: I'm writing code");
    }

    public void codeReview(){

    }
}
