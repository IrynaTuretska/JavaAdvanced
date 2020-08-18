package ls20200817_usingInterfaceDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringActionTest {
    /*
    test structure:
        input data
        call the method
        check if result as expected
     */

    @Test
    public void doAction_baseString_reverseString() {//тест на положительный результат
        String str = "1234";
        Action action = new ReverseStringAction();
        assertEquals("4321", action.doAction(str));
    }

    //проверка краевых условий:
    @Test
    public void doAction_emptyString_returnEmptyString() {
        String str = "";
        Action action = new ReverseStringAction();
        assertEquals("", action.doAction(str));
    }

    @Test
    public void doAction_Null_returnNull() {
        String str = null;
        Action action = new ReverseStringAction();
        assertNull(null, action.doAction(str)); //для null отдельный assert
    }

}