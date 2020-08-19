package ls20200817_usingInterfaceDemo;

public class LengthMoreThanFourCondition implements Condition {
    @Override
    public boolean test(String str) {
        return (str != null && str.length() > 4);

       /*
        if (str == null) {
            return false;
        } else if (str.length() > 4) {
            return true;
        } else
            return false;*/
    }
}
