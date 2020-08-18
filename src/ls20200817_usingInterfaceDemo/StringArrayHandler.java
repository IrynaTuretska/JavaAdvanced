package ls20200817_usingInterfaceDemo;

import java.util.Arrays;

public class StringArrayHandler {
    private String[] strings;

    public StringArrayHandler(String[] strings) {
        this.strings = strings;
    }

    public String[] getStrings() {
        return strings;
    }

    @Override
    public String toString() {
        return Arrays.toString(strings);
    }

    //универсальный метод, не зависит от конкретного метода или условия
    public void stringsHandle(Action action, Condition condition){
        for (int i = 0; i < strings.length; i++) {
            if(condition.test(strings[i])){ // проверка условия - true/false
                strings[i] = action.doAction(strings[i]); // if true, выполняем действие
            }
        }
    }
}
