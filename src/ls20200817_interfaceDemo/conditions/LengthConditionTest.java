package ls20200817_interfaceDemo.conditions;

import ls20200817_interfaceDemo.Condition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LengthConditionTest {

    @Test
    public void test_stringBiggerThan4_True() {
        String str = "12345";
        Condition condition = new LengthCondition(4);
        Assertions.assertTrue(condition.test(str));
    }

    @Test
    public void test_stringLessThan4_False() {
        String str = "123";
        Condition condition = new LengthCondition(4);
        Assertions.assertFalse(condition.test(str));
    }

    @Test
    public void test_stringEmpty_False() {
        String str = "";
        Condition condition = new LengthCondition(4);
        Assertions.assertFalse(condition.test(str));
    }

    @Test
    public void test_stringNull_False() {
        String str = null;
        Condition condition = new LengthCondition(4);
        Assertions.assertFalse(condition.test(str));
    }

    @Test
    public void test_stringBiggerThanZero_True() {
        Condition condition = new LengthCondition(0);

        boolean res = (condition.test("1") == true)
                && (condition.test("123") == true)
                && (condition.test("") == false)
                && (condition.test(null) == false);
        Assertions.assertTrue(res);
    }

}