package hw14_1;

/**
 * JavaAdvanced 02.07.2020
 */
public class JavaScriptProgrammer extends Programmer {

    public JavaScriptProgrammer(String name, String position, double salary) {
        super(name, position, salary);
    }

    public void work() {
        System.out.println("My name is " + getName() + ". I'm " + getPosition() + " I write JavaScript program");
    }

    public void codeReview() {
        System.out.println("This JavaScript code is good");
    }
}
