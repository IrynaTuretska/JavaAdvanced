package ls20200630_employee;

/**
 * JavaAdvanced 02.07.2020
 */
public class CProgrammer extends Programmer {
    public CProgrammer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void codeReview(){
        System.out.println("This C code is good");
    }
}
