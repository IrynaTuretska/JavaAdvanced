package ls20200817_interfaceDemo.actions;

import ls20200817_interfaceDemo.Action;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringAction2Test {
    @Test
    public void doAction_baseString_reverseString() {//тест на положительный результат
        String str = "1234";
        Action action = new ReverseStringAction2();
        assertEquals("4321", action.doAction(str));
    }

    //проверка краевых условий:
    @Test
    public void doAction_emptyString_returnEmptyString() {
        String str = "";
        Action action = new ReverseStringAction2();
        assertEquals("", action.doAction(str));
    }

    @Test
    public void doAction_Null_returnNull() {
        String str = null;
        Action action = new ReverseStringAction2();
        assertNull(null, action.doAction(str)); //для null отдельный assert
    }

}