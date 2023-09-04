import java.util.Stack;

public class prb_07 {

    public static boolean isDuplicate(String str) {
        // creating a stack ..
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // case 1: Closing..
            if (ch == ')') {
                // for counting ..
                int count = 0;
                while (s.pop() != '(') {
                    count++;
                }
                if (count < 1) {
                    return true; // means duplicate is exist..
                }
            } else {// case 2 : Opening , Operator, Operand..
                s.push(ch);

            }

        }
        return false;

    }

    public static void main(String[] args) {
        String str1 = "((a+b))";
        String str2 = "(a-b)";
        System.out.println(isDuplicate(str1));
    }
}
