import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {
    public static boolean isbalanced(String str) {
        Stack<Character> stk = new Stack<>();
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '(') {
                stk.push(str.charAt(i));
            }
            if (str.charAt(i) == ')') {
                if(stk.isEmpty()){
                    return true;
                }
                stk.pop();
            }
            i++;

        }

        if (stk.isEmpty()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "(()))";
        boolean ans = isbalanced(str);
        System.out.println(ans);

    }
}