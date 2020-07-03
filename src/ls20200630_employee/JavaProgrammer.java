package ls20200630_employee;

/**
 * JavaAdvanced 02.07.2020
 */
public class JavaProgrammer extends Programmer{
    public JavaProgrammer(String name, double salary) {
        super(name, salary);
    }
    @Override
    public void codeReview(){
        System.out.println("This Java code is good");
    }
    //цепочка наследования:
    //Object -> Employee -> Programmer -> JavaProgrammer

}
