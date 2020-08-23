package ls20200817_interfaceDemo.actions;

import ls20200817_interfaceDemo.Action;

public class ReverseStringAction2 implements Action {
    @Override
    public String doAction(String str) {
        if(str == null) return null;

        StringBuffer stringBuffer = new StringBuffer(str);
        return stringBuffer.reverse().toString();
    }
}
