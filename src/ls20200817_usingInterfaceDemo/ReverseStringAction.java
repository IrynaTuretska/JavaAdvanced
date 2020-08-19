package ls20200817_usingInterfaceDemo;

public class ReverseStringAction implements Action {
    @Override
    public String doAction(String str) {
        if (str == null) return null;
        char[] chars = str.toCharArray();
        char[] res = new char[str.length()];
        for (int i = 0, j = res.length - 1; i < str.length(); i++, j--) {
            res[j] = chars[i];
        }
        return new String(res);
    }

        /*
        String result = "";
        if (str == null) {
            return null;
        } else {
            for (int i = 0; i < str.length(); i++) {
                result = str.charAt(i) + result;
            }
        }
        return result;
    }*/
}
