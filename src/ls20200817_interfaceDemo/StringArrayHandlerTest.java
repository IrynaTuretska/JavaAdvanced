package ls20200817_interfaceDemo;

import ls20200817_interfaceDemo.actions.TestAction;
import ls20200817_interfaceDemo.conditions.TestCondition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringArrayHandlerTest {
    @Test
    public void stringsHandle_NormalCase() {
        String[] strings = {"123", "qwerty", "123456", "14", "1667", ""};
        String[] expectedArr = {"test", "test", "test", "14", "test", ""};
        StringArrayHandler stringArrayHandler =
                new StringArrayHandler(strings, new TestAction(), new TestCondition());
        stringArrayHandler.stringsHandle();

        assertArrayEquals(expectedArr, stringArrayHandler.getStrings());
    }

    @Test
    public void stringsHandle_NullAction_nothing() {
        String[] strings = {"123", "qwerty", "123456", "14", "1667", ""};
        String[] expectedArr = {"123", "qwerty", "123456", "14", "1667", ""};
        StringArrayHandler stringArrayHandler =
                new StringArrayHandler(strings, null, new TestCondition());
        stringArrayHandler.stringsHandle();

        assertArrayEquals(expectedArr, stringArrayHandler.getStrings());
    }

    @Test
    public void stringsHandle_NullCondition_doActionForAll() {
        String[] strings = {"123", "qwerty", "123456", "14", "1667", ""};
        String[] expectedArr = {"test", "test", "test", "test", "test", "test"};
        StringArrayHandler stringArrayHandler =
                new StringArrayHandler(strings, new TestAction(), null);
        stringArrayHandler.stringsHandle();

        assertArrayEquals(expectedArr, stringArrayHandler.getStrings());
    }

    @Test
    public void stringsHandle_NullArray_nothing() {
        StringArrayHandler stringArrayHandler =
                new StringArrayHandler(null, new TestAction(), new TestCondition());
        stringArrayHandler.stringsHandle();

        assertNull(stringArrayHandler.getStrings());
    }
}