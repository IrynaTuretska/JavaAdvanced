package ls20200817_interfaceDemo.actions;

import ls20200817_interfaceDemo.Action;

public class TestAction implements Action {
    @Override
    public String doAction(String str) {
        if (str == null) return null;
        return "test";
    }
}
