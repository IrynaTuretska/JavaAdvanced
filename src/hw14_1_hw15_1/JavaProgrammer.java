package hw14_1_hw15_1;

/**
 * JavaAdvanced 02.07.2020
 */
public class JavaProgrammer extends Programmer {

    public JavaProgrammer(String name, String position, double salary) {
        super(name, position, salary);
    }

    public void work() {
        System.out.println("My name is " + getName() + ". I'm " + getPosition() + ". I write Java program");
    }

    public void codeReview() {
        System.out.println("This Java code is good");
    }
}
