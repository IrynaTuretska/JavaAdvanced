package ls20200914_Stack_BracktesChecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketsCheckerTest {
    @Test
    public void bracketsCheckerTest(){
        BracketsChecker checker = new BracketsChecker();
        assertTrue(checker.test("qwer(t)y"));
        assertTrue(checker.test("qwe(r(t))y"));
        assertTrue(checker.test("q{we}{(r(t))y}"));
        assertTrue(checker.test("q{we}{(r(t))yfdldk[df[g];d]lgk}"));
        assertTrue(checker.test(""));
        assertTrue(checker.test("()"));
        assertTrue(checker.test("qwerty"));
        assertTrue(checker.test("(qwerty)"));

        assertFalse(checker.test(null));
        assertFalse(checker.test("(j]"));
        assertFalse(checker.test("({j]"));
        assertFalse(checker.test(")rr]rr)ee(ss[ff("));
        assertFalse(checker.test("(aaa{fff)bbb}"));
    }
}