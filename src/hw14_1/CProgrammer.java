package hw14_1;

/**
 * JavaAdvanced 02.07.2020
 */
public class CProgrammer extends Programmer {

    public CProgrammer(String name, String position, double salary) {
        super(name, position, salary);
    }

    public void work() {
        System.out.println("My name is " + getName() + ". I'm " + getPosition() + " I write C program");
    }

    public void codeReview() {
        System.out.println("This C code is good");
    }
}
