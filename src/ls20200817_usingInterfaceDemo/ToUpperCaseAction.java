package ls20200817_usingInterfaceDemo;

public class ToUpperCaseAction implements Action{
    @Override
    public String doAction(String str) {
        return str.toUpperCase();
    }
}
