package ls20200817_usingInterfaceDemo;

public class DivideStringCondition implements Condition {
    @Override
    public boolean test(String str) {
        if (str == null) {
            return false;
        } else if (str.length() > 4) {
            return true;
        } else
            return false;
    }
}
