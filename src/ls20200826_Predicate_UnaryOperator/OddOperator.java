package ls20200826_Predicate_UnaryOperator;

import java.util.function.UnaryOperator;

public class OddOperator implements UnaryOperator<String> {
    @Override
    public String apply(String s) {
        if (s == null) return null;

        StringBuilder sRes = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i += 2) {
            sRes.append(s.charAt(i));
        }
        return sRes.toString();
    }
}
