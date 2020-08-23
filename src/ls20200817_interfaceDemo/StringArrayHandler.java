package ls20200817_interfaceDemo;

import java.util.Arrays;

public class StringArrayHandler {
    private String[] strings;
    private Action action;
    private Condition condition;

    public StringArrayHandler(String[] strings, Action action, Condition condition) {
        this.strings = strings;
        this.action = action;
        this.condition = condition;
    }

    public String[] getStrings() {
        return strings;
    }

    @Override
    public String toString() {
        return Arrays.toString(strings);
    }

    //универсальный метод, не зависит от конкретного метода или условия
    public void stringsHandle() { //variant: вместо void -> StringArrayHandler
        if (this.strings == null || this.action == null) {
            return;
        }

        for (int i = 0; i < strings.length; i++) {
            if (condition == null || condition.test(strings[i])) { // проверка условия - true/false
                strings[i] = action.doAction(strings[i]); // if true, выполняем действие
            }
        }
    } //variant: return this;
}
