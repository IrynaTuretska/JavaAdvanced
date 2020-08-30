package ls20200826_Predicate_UnaryOperator;

import java.util.function.UnaryOperator;

public class EvenOperator implements UnaryOperator<String> {
    @Override
    public String apply(String s) {
        if (s == null) return null;

//        String res = "";
//        for (int i = 1; i < s.length(); i += 2) {
//            res += s.charAt(i);
//        }
//        return res;

        StringBuilder sRes = new StringBuilder(s.length());
        for (int i = 1; i < s.length(); i += 2) {
            sRes.append(s.charAt(i));
        }
        return sRes.toString();
    }
}
