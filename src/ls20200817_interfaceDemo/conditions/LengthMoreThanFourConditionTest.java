package ls20200817_interfaceDemo.conditions;

import ls20200817_interfaceDemo.Condition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LengthMoreThanFourConditionTest {
    @Test
    public void test_stringBiggerThan4_True() {
        String str = "12345";
        Condition condition = new LengthMoreThanFourCondition();
        Assertions.assertTrue(condition.test(str));
    }

    @Test
    public void test_stringLessThan4_False() {
        String str = "123";
        Condition condition = new LengthMoreThanFourCondition();
        Assertions.assertFalse(condition.test(str));
    }

    @Test
    public void test_stringEqual4_False() {
        String str = "1234";
        Condition condition = new LengthMoreThanFourCondition();
        Assertions.assertFalse(condition.test(str));
    }

    @Test
    public void test_stringEmpty_False() {
        String str = "";
        Condition condition = new LengthMoreThanFourCondition();
        Assertions.assertFalse(condition.test(str));
    }

    @Test
    public void test_stringNull_False() {
        String str = null;
        Condition condition = new LengthMoreThanFourCondition();
        Assertions.assertFalse(condition.test(str));
    }
}
