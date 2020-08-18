package ls20200817_usingInterfaceDemo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DivideStringConditionTest {
    @Test
    public void test_stringBiggerThan4_True() {
        String str = "12345";
        Condition condition = new DivideStringCondition();
        Assertions.assertTrue(condition.test(str));
    }

    @Test
    public void test_stringEmpty_False() {
        String str = "";
        Condition condition = new DivideStringCondition();
        Assertions.assertFalse(condition.test(str));
    }

    @Test
    public void test_stringNull_False() {
        String str = null;
        Condition condition = new DivideStringCondition();
        Assertions.assertFalse(condition.test(str));
    }

}