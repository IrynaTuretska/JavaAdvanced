package ls20200817_interfaceDemo;

/*
1. перебрать массив
2. выбрать нужные (условие) - выносим в интерфейс, в параметры
3. реверс (действие) - выносим в интерфейс
 */

import ls20200817_interfaceDemo.actions.ReverseStringAction;
import ls20200817_interfaceDemo.actions.ToUpperCaseAction;
import ls20200817_interfaceDemo.conditions.LengthCondition;
import ls20200817_interfaceDemo.conditions.LengthMoreThanFourCondition;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"12", "qwerty", "123456", "154", "1667", ""};
        StringArrayHandler stringArrayHandler =
                new StringArrayHandler(strings, new ReverseStringAction(), new LengthMoreThanFourCondition());

//        Condition condition = new LengthMoreThanFourCondition();
//        Action action = new ReverseStringAction();

//        stringArrayHandler.stringsHandle();
        System.out.println(stringArrayHandler.toString());

//        StringArrayHandler stringArrayHandler2 =
//                new StringArrayHandler(strings, new ReverseStringAction(), new LengthCondition(2));
//
//        stringArrayHandler2.stringsHandle();
//        System.out.println(stringArrayHandler2.toString());
//
//        StringArrayHandler stringArrayHandler3 =
//                new StringArrayHandler(strings, new ToUpperCaseAction(), new LengthCondition(2));
//
//        stringArrayHandler3.stringsHandle();
//        System.out.println(stringArrayHandler3.toString());
//
        ActionAndConditionExample actAndCond = new ActionAndConditionExample();

        StringArrayHandler stringArrayHandler4 =
                new StringArrayHandler(strings, actAndCond, actAndCond);

        stringArrayHandler4.stringsHandle();
        System.out.println(stringArrayHandler4.toString());

    }
}
