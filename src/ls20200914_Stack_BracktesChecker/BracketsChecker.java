package ls20200914_Stack_BracktesChecker;

import java.util.Stack;
import java.util.function.Predicate;

public class BracketsChecker implements Predicate<String> {
    public static void main(String[] args) {

    }

    private char[][] brackets = { //массив из массивов
            {'(', ')'},
            {'{', '}'},
            {'[', ']'},
    };

    @Override
    public boolean test(String s) {
        if (s == null) return false;
        Stack<Character> stack = new Stack<>();
        for (char ch : s.trim().toCharArray()) {
            if (isOpenBracket(ch)) {
                stack.push(ch);
            } else { //эта часть работает только с закрывающими скобками: }->{; )->(; ]->[
                char closeCh = getOpenBracket(ch);
                if (closeCh != ' ' && (stack.size() == 0 || !stack.pop().equals(closeCh))) {
                    return false;
                }
            }
        }
        return (stack.size() == 0);
    }

    private char getOpenBracket(char ch) {
        for (char[] bracket : brackets) {
            //если встретили закрывающую скобку из колонки 1, возвращаем открывающую скобку из колонки 0
            if (ch == bracket[1]) {
                return bracket[0];
            }
        }
        return ' ';
    }

    private boolean isOpenBracket(char ch) {
        for (char[] bracket : brackets) {
            //проверяем, содержится ли нужный символ - открывающая скобка - в нулевой колонке
            if (ch == bracket[0]) {
                return true;
            }
        }
        return false;
    }
}
