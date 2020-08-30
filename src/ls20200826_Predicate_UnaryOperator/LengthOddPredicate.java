package ls20200826_Predicate_UnaryOperator;

import java.util.function.Predicate;

public class LengthOddPredicate implements Predicate<String> {
    @Override
    public boolean test(String s) {
        if (s == null) return false;
        return (s.length() % 2 != 0);
    }
}
