package ls20200817_interfaceDemo.actions;

import ls20200817_interfaceDemo.Action;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToUpperCaseActionTest {

    @Test
    public void doAction_NormalString_ShouldBeUpperCase() {
        String str = "moLOko-МоЛоко";
        Action action = new ToUpperCaseAction();
        assertEquals("MOLOKO-МОЛОКО", action.doAction(str));
    }

    @Test
    public void doAction_EmptyString_returnEmptyString() {
        String str = "";
        Action action = new ToUpperCaseAction();
        assertEquals("", action.doAction(str));
    }

    @Test
    public void doAction_Null_returnNull() {
        String str = null;
        Action action = new ToUpperCaseAction();
        assertNull(null, action.doAction(str)); //для null отдельный assert
    }
}