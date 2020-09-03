package ls20200901_ListString;

import java.util.function.Predicate;

public class PredicatePalindrome implements Predicate<String> {

    @Override
    public boolean test(String s) {
        if (s == null) return false;
        //return new StringBuffer(s).reverse().toString().equalsIgnoreCase(s);

        return new StringBuffer(s).reverse().toString().replace(" ","").equalsIgnoreCase(s);
    }
}
