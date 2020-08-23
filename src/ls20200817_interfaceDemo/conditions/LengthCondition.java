package ls20200817_interfaceDemo.conditions;

import ls20200817_interfaceDemo.Condition;

public class LengthCondition implements Condition {
    private int length;

    public LengthCondition(int length) {
        this.length = length;
    }

    @Override
    public boolean test(String str) {
        return (str != null && str.length() > length);
    }
}
