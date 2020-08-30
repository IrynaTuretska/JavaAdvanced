package ls20200826_Predicate_UnaryOperator;

import org.junit.jupiter.api.Test;

import java.util.function.UnaryOperator;

import static org.junit.jupiter.api.Assertions.*;

class OddOperatorTest {
    @Test
    public void apply_string_oddCharsString() {
        UnaryOperator<String> operator = new OddOperator();
        assertEquals("1357", operator.apply("12345678"));
    }

    @Test
    public void apply_stringNull_returnNull() {
        UnaryOperator<String> operator = new OddOperator();
        assertNull(operator.apply(null));
    }

    @Test
    public void apply_emptyString_returnEmptyString() {
        UnaryOperator<String> operator = new OddOperator();
        assertEquals("", operator.apply(""));
    }

    @Test
    public void apply_oneCharString_String() {
        UnaryOperator<String> operator = new OddOperator();
        assertEquals("1", operator.apply("12"));
    }
}