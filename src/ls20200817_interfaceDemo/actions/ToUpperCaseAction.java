package ls20200817_interfaceDemo.actions;

import ls20200817_interfaceDemo.Action;

public class ToUpperCaseAction implements Action {
    @Override
    public String doAction(String str) {
        if(str == null) return null;
        return str.toUpperCase();
    }
}
