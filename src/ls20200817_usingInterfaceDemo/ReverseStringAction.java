package ls20200817_usingInterfaceDemo;

public class ReverseStringAction implements Action {
    @Override
    public String doAction(String str) {
// не работает тест на null
//        char[] chars = str.toCharArray();
//        String result = "";
//        if (str == null) {
//            return null;
//        } else {
//            for (int i = chars.length - 1; i >= 0; i--) {
//                result += chars[i];
//            }
//        }
//        return result;
//    }

        String result = "";
        if (str == null) {
            return null;
        } else {
            for (int i = 0; i < str.length(); i++) {
                result = str.charAt(i) + result;
            }
        }
        return result;
    }
}
