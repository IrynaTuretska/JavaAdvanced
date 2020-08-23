package ls20200817_interfaceDemo.conditions;

import ls20200817_interfaceDemo.Condition;

public class TestCondition implements Condition {
    @Override
    public boolean test(String str) {
        return str != null && str.length() > 2;
    }
}
